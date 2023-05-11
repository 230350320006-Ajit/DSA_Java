/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraycircularqueue;

/**
 *  in this project,
        front and rear is init with 0, so for isFull condition 1 location is always blank (can't use)
        we can use (N-1) locations , this is only one dis-advantage of this Style, rather than,
        this style is efficient than others
 */
public class CircularQueueImple implements CircularQueue{
    int arr[];
    int front,rear,size;         //default 0
    public CircularQueueImple()
    {
        size=5+1;
        arr=new int[size];
    }
    public CircularQueueImple(int size)
    {
        this.size=size;
        arr=new int[size];
    }
    @Override
    public boolean isEmpty()
    {
        return front==rear;
    }
    
    @Override
    public boolean isFull()
    {
        return (rear+1)%size==front;
    }
    
    @Override
    public int deleteQ()
    {
        if(isEmpty())
            throw new RuntimeException("Circular-Queue is empty");
        front=(front+1)%size;
        return arr[front];
    }
    
    @Override
    public void addQ(int value)
    {
        if(isFull())
            throw new RuntimeException("Circular-Queue is Full");
        rear=(rear+1)%size;
        arr[rear]=value;
    }
    
    @Override
    public int[] iterate()
    {
        if(isEmpty())
            throw new RuntimeException("Circular-Queue is Empty");
        int remain[]=new int[rear-front];
        int c=0;
        for(int i=(front+1);i<=rear;i++)       //front+1 ,cause access point should start from next
            remain[c++] = arr[i];
        
        return remain;
    }
}
