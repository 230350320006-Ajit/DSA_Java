/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doublycircularlinkedlist;

/**
 *
 * @author Upgrade
 */
public class DoublyCircularImple implements DoublyCircularInterface {
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
    public DoublyCircularImple()
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
            head.next=head;
            head.prev=head;
            size++;
        }
        else
        {
        newNode.next=head;
        newNode.prev=head.prev;
        head.prev.next=newNode;
        head.prev=newNode;
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
            while(temp.next!=head)
            {
                if(++count==po)
                {
                 Node newNode= new Node(i);
                 newNode.next=temp.next;
                 newNode.prev=temp.next.prev;
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
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newNode;  // ?
            newNode.next=head;
            newNode.prev=head.prev;
            head.prev.next=newNode;
            head.prev=newNode;
            size++;       
        }
    }
    
    @Override
    public int deleteFirst()
    {
        int val=-1;
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        else if(head.next==head)
        {
            val=head.data;
            head=null;          
            size--;
            return val;
        }
        else
        {
            val=head.data;
            head.prev.next=head.next;
            head.next.prev=head.prev;
            head=head.next;
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
            if(temp.next==head || po==1)
                return deleteFirst();
            else if(po==size)
                return deleteLast();
            else
            {
                int val=-1,count=2;     //pre-checking position,before actual position node for temp.next=temp.next.next;
                do
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
                }while(temp.next!=head);
                return val;
            }
        }
    }
    
    @Override
    public int deleteLast()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        else if(head.next==head)
        {
            int val=head.data;
            head=null;
            size--;
            return val;
        }
        else
        {
            Node last = head.prev;
                int val=last.data;
            last.prev.next = head;
            head.prev = last.prev;
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
            int c=0;
            do
            {
                arr[c++]=temp.data;
                temp=temp.next;
            }while(temp!=head);
        return arr;
    }
    
    @Override
    public int[] traversePrev()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
      
            Node temp=head;               //temp=tail
            int arr[]=new int[size];
            int c=0;
            do
            {
                temp=temp.prev;
                arr[c++]=temp.data;
            }while(temp!=head);      
        return arr;
    }    
}
