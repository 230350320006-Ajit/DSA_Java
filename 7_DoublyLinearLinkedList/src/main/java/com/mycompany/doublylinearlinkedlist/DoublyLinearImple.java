/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublylinearlinkedlist;

/**
 *
 * @author Upgrade
 */
public class DoublyLinearImple implements DoublyLinearInterface{
    static class Node
    {
        private int data;
        private Node next,prev;
        public Node()
        {
            next=null;
            prev=null;
        }
        public Node(int val)
        {
            data=val;
            next=prev=null;
        }
    }
    private Node head;
    private int size;
    public DoublyLinearImple()
    {
        head=null;
        size=0;
    }
    
    @Override
    public void addFirst(int i)
    {
        Node newNode=new Node(i);
        if(isEmpty())
        {
            head=newNode;
            size++;
        }
        else
        {
        newNode.next=head;
        head.prev = newNode;
        head=newNode;
        size++;
        }
    }
    
    @Override
    public void addPosition(int po,int i)
    {
        if(isEmpty() || po<=1)
            addFirst(i);
        else if(po>size)
            throw new RuntimeException("invalid position");
        else
        {
            Node temp=head;
            int count=1;
            while(temp!=null)
            {
                if(++count==po)
                {
                 Node newNode= new Node(i);
                 newNode.next=temp.next;
                 newNode.prev=temp;
                 temp.next.prev=newNode;
                 temp.next=newNode;    //
                 size++;
                 ///break;----------------------------------
                }
                temp=temp.next;
            }
        }
    }
    
    @Override
    public void addLast(int i)
    {
        Node newNode=new Node(i);
        if(isEmpty())
            addFirst(i);
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=null;      //no need of this
            size++;       
        }
    }
    
    @Override
    public int deleteFirst()
    {
        int val=-1;
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        else
        {
            val=head.data;
            head=head.next;
            head.prev=null;
            size--;
        }
        return val;
    }
    
    @Override
    public int deletePosition(int po)
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        else if(po<0 || po>size)
            throw new RuntimeException("invalid position");
        else
        {
            Node temp=head;
            if(temp.next==null || po==1)
                return deleteFirst();
            else if(po==size)
                return deleteLast();
            else
            {
                int val=-1,count=2;     //pre-checking position,before actual position node for temp.next=temp.next.next;
                while(temp!=null)
                {
                    if(count==po)
                    {
                    val=temp.next.data;
                    temp.next=temp.next.next;
                    temp.next.next.prev=temp;      //if list contain 3 or less node then it lead error, use deleteFirst, deleteLast
                     size--;
                     break;
                    }
                    temp=temp.next;
                    count++;
                }
                return val;
            }
        }
    }
    
    @Override
    public int deleteLast()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        else if(head.next==null)
        {
            int val=head.data;
            head=null;
            return val;
            //return deleteFirst();
        }
        else
        {
            Node temp=head;
            int val=-1;
            while(temp.next!=null)
            {
                if(temp.next.next==null)
                { 
                    val=temp.next.data;
                    temp.next=null;
                    //temp.next.next=null;
                    break;
                }
                temp=temp.next;
            }
            size--;
          return val;
        }
    }
    
    @Override
    public boolean isEmpty()
    {
        return head==null;
    }
    
    @Override
    public int[] traverseNext()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
      
            Node temp=head;
            int arr[]=new int[size];
            int i=0;
            while(temp!=null)
            {
                arr[i++]=temp.data;
                temp=temp.next;
            }
        return arr;
    }
    
    @Override
    public int[] traversePrev()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
      
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            
            int arr[]=new int[size];
            int i=0;
            while(temp!=null)
            {
                arr[i++]=temp.data;
                temp=temp.prev;
            }
        return arr;
    }
}
