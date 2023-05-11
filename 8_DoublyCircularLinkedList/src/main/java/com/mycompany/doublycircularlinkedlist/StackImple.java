/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublycircularlinkedlist;

/**
 *
 * @author Upgrade
 */
public class StackImple extends DoublyCircularImple{
    
    public void push(int i)
    {
        addFirst(i);
    }
    
    public int pop()
    {
        return deleteFirst();
    }
    
    public int peek()
    {
        int arr[]=traverseNext();
        return arr[0];
    }
    
    public static void main(String[] args) {
        StackImple s= new StackImple();
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println("peek :"+s.peek());
        System.out.println("pop :"+s.pop());
        System.out.println("pop :"+s.pop());
        System.out.println("pop :"+s.pop());
       // System.out.println(s.pop());        
    }
}
