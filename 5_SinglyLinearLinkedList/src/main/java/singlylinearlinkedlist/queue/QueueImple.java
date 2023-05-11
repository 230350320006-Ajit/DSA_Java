/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlylinearlinkedlist.queue;

import singlylinearlinkedlist.SinglyLinearImple;

/**
 *
 * @author Upgrade
 */
public class QueueImple extends SinglyLinearImple{
    
    public int front()   //delete from one end i.e. first
    {
         return deleteFirst();
    }
    
    public void rear(int i)     //insert at end i.e. addlast
    {
        addLast(i);
    }
    
    public int[] visits()
    {
        return traverse();
    }
    
    public static void main(String[] args) {
    QueueImple q = new QueueImple();
    q.rear(10);
    q.rear(20);
    q.rear(30);
    q.rear(40);
    System.out.println(java.util.Arrays.toString(q.visits()));

    System.out.println("delete :"+q.front());
    System.out.println("delete :"+q.front());
    System.out.println("delete :"+q.front());
    System.out.println("delete :"+q.front());
//    q.front();
    }
}
