/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlylinearlinkedlist;

/**
 *
 * @author Upgrade
 */
public class SinglyLinearImple implements SinglyLinearInterface{
   // inner class for creating NODE (value,next)
    static class Node{
        private int data;
        private Node next;
        public Node()
        {
            next=null;
        }
        public Node(int n)
        {
            data=n;
            next=null;
        }
    }
    private Node head;    // for access point 
    private int size;    // for count of nodes
    public SinglyLinearImple()
    {
        head=null;
        size=0;
    }
    
    @Override
    public boolean isEmpty()
    {
        return head==null;
    }
    
    @Override
    public void addFirst(int i)
    {
        Node newNode=new Node(i);
        newNode.next=head;
        head=newNode;
        size++;
    }
    
    @Override
    public void addPosition(int pos,int i)
    {          
        if(isEmpty() || pos<=1)
           addFirst(i);
        else if(pos>size)
           throw new RuntimeException("invalid position");
        else{
           Node temp=head;
           int c=1;
           while(temp!=null)
            {
                if(++c==pos)
                {
                    Node newNode=new Node(i);
                    newNode.next=temp.next;
                    temp.next=newNode;
                }
                temp=temp.next;
                //c++;
            }
           size++;
        }
    }
    
    @Override
    public void addLast(int i)
    {
        Node temp=head; 
        Node newNode = new Node(i);

        if(isEmpty())
          addFirst(i);  
        else if(temp.next==null)
        {
            temp.next=newNode;
            size++;
        }
        else{
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;   // so automatically link at last to list
            size++;
        }
    }
    
    @Override
    public int deleteFirst()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        int value=head.data;
        head=head.next;
        size--;
        return value;
    }
    
    @Override
    public int deletePosition(int pos)
    {
        int value=-1;
        if(isEmpty())
            throw new RuntimeException("List is empty");
        else if(pos<0 || pos>size)
            throw new RuntimeException("invalid position");
        else
        {
           Node temp=head;
           if(temp.next==null  || pos==1)    //if position=1 || list contain only one NODE
               return deleteFirst();
           else
           {
               Node trav=null;
               int c=2;            //pre-checking position,before actual position node for temp.next=temp.next.next;
            while(temp!=null)
                {
                    if(c==pos)
                    {
                        value=temp.next.data;
                        temp.next=temp.next.next;
                        size--;
                    }
                    temp=temp.next;
                    c++;
                }
           }
        }
        return value;
    }
    
    @Override
    public int deleteLast()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        if(head.next==null)
           return deleteFirst();
        else{
                Node temp=head;
                int value=-1;
                while(temp.next!=null)
                {
                    if(temp.next.next==null)
                    {
                    value=temp.next.data;
                    temp.next=null;
                    temp=temp.next;
                    break;
                    }
                    temp=temp.next;
                }
                size--;
            return value;
            }
    }
    
    @Override
    public int[] traverse()
    {
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        
        Node temp=head;
        int arr[]=new int[size];
        int i=0;
        while(temp!=null)
        {
            arr[i++] = temp.data;
            temp=temp.next;
        }
        return arr;
    }
}
