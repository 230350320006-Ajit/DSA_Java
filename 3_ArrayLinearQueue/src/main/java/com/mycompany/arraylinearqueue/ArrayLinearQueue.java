/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylinearqueue;

/**
 *
 * @author Upgrade
 */
public class ArrayLinearQueue {

    public static void main(String[] args) {
       try{
        LinearQueueImple obj=new LinearQueueImple();  //default size 5
        obj.addQ(11);
        obj.addQ(22);
        obj.addQ(33);
        obj.addQ(44);
        obj.addQ(55);
        //obj.addQ(66);   Queue is Full
        System.out.println("isFull :"+obj.isFull());
        
        System.out.println(obj.deleteQ());
        System.out.println(obj.deleteQ());
        System.out.println(obj.deleteQ());
        System.out.println(obj.deleteQ());
        System.out.println(obj.deleteQ());
        System.out.println("isEmpty :"+obj.isEmpty());
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
    }
}
