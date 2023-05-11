/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraycircularqueue;

/**
 *
 * @author Upgrade
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
