/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraycircularqueue;

/**
 *
 * front,rear start with 0, so we can use N-1 location only 
 */
public class ArrayCircularQueue {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("enter size for array :");
        int size=sc.nextInt();
        CircularQueueImple obj=new CircularQueueImple(size+1);  //+1 for use of all location
        int choice=-1;
    do{
          System.out.println("\n0. Exit\n1. Add\n2. Delete\n3. Iterate\nEnter choice: ");  
        try{
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("enter value :");
                    obj.addQ(sc.nextInt());
                    break;
                case 2:
                    System.out.println("deleted value :"+obj.deleteQ());
                    break;
                case 3:
                    System.out.print("elements :\n");
                    System.out.print(java.util.Arrays.toString(obj.iterate()));
                    break;
            }    
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
     }while(choice!=0);
    }
}
