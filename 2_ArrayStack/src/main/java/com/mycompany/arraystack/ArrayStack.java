/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraystack;

/**
 *
 * @author Upgrade
 */
public class ArrayStack {

    public static void main(String[] args) {
        try{
        StackImple obj=new StackImple();  //default size 5
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.push(55);
       // obj.push(55);      stack is full
       System.out.println("isFull :"+obj.isFull());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        //System.out.println(obj.pop());   stack is empty
       System.out.println("isEmpty :"+obj.isEmpty());
       obj.push(65);
        System.out.println("top :"+obj.peek());
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
