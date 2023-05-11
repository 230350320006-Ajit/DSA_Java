/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraystack;

/**
 *
 * @author Upgrade
 */
public class StackImple implements StackInterface {
    private int arr[];
    private int top;
    
    public StackImple()
    {
        arr=new int[5];
        top=-1;
    }
    public StackImple(int size)
    {
        this.arr=new int[size];
        top=-1;
    }
    
   @Override
    public boolean isEmpty()
    {
        return top==-1;
    }
    
    @Override
    public boolean isFull()
    {
        return top==(arr.length-1);
    }   
    
    @Override
    public void push(int value)
    {
        if(isFull())
            throw new RuntimeException("Stack is Full");
        arr[++top]=value;
    }
    
    @Override
    public int pop()
    {
        if(isEmpty())
            throw new RuntimeException("Stack is Empty");
        
        return arr[top--];
    }   
    
    @Override
    public int peek()
    {
        if(isEmpty())
            throw new RuntimeException("Stack is Empty");
        
        return arr[top];
    }   
}
