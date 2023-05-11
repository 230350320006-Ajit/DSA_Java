/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylinearqueue;

/**
 *
 * @author Upgrade
 */
public class LinearQueueImple implements LinearQueue{
    int arr[];
    int front,rear,size;
    public LinearQueueImple()
    {
        size=5;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public LinearQueueImple(int size)
    {
        this.size=size;
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    @Override
   public void addQ(int value)
    {
        if(isFull())
            throw new RuntimeException("Queue is Full");
        
        arr[++rear]=value;
    }
    
    @Override
   public int deleteQ()
    {
        if(isEmpty())
            throw new RuntimeException("Queue is Empty");
        return arr[++front];
    }
    
    @Override
   public boolean isEmpty()
    {
        return front==rear;        
    }
    
    @Override
   public boolean isFull()
    {
        return rear==size-1;
    } 
}
