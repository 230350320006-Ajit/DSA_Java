
public class DoublyLinear {

	static class Node
	{
		private int data;
		private Node next;
		private Node prev;
		public Node()
		{ data=0;   next=null;   prev=null;		}
		public Node(int d)
		{
			data=d;   next=null;    prev=null;
		}
		
	}
	private Node head;
	private Node tail;
	public DoublyLinear()
	{	head=null;        tail=null;       }
	
	public void addFirst(int d)
	{
		Node newNode = new Node(d);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			return ;
		}
		else {
		newNode.next=head;
        head.prev = newNode;
        head=newNode;
		}
	}
	
	  public void addMiddle(int d)   //add sorting order
	  {
		 Node newNode = new Node(d); 
		 Node current = head;
		 if(head==null  || d <= head.data)      
			 addFirst(d);
		 
		 else if(d>head.data && d<tail.data)
		 {
			 while(current!=null)
			 {
				if(current.data > d)
					break;
				
					current = current.next;
			 }
			 newNode.next = current;
			 newNode.prev = current.prev;
			 current.prev.next = newNode;
			 current.prev = newNode;
		 }
		 else
		 {
			 tail.next = newNode;
			 newNode.prev = tail;
			 tail = newNode;
		 }
	  
	  }
	 
	public void addLast(int d)
	{
		Node newNode  = new Node(d);
		if(head==null)
			addFirst(d);
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public int deleteFirst()
	{ 
		int val = -1;
		if(head==null)
			throw new RuntimeException("List is Empty");
		else if(head==tail)
		{
			val = head.data;
			head=null;
			tail=null;
			return val;
		}
		else
		{
			val = head.data;
			head.next.prev=null;
			head = head.next;
			return val;
		}
	}

	public int deleteAny(int d)
	{
		if(head==null)
			throw new RuntimeException("List is Empty");
		else if(d>head.data && d<tail.data)
		{
			Node current = head;
			boolean flag=false;
			while(current!=null)
			{
				if(current.data!=d)
				current = current.next;
				else
				{
					flag=true;  break;
				}
			}
			if(flag==true)
			{
			int val = current.data;
			current.prev.next = current.next;
			current.next.prev = current.prev;
			return val;
			}
			else
				throw new RuntimeException("value not found in List");
		}
		else if(head.data == d)
			return deleteFirst();
		else if(tail.data == d)
			return deleteLast();
		else
			throw new RuntimeException("value not found in List");
	}
	public int deleteLast()
	{
		int val = -1;
		if(tail==null)
			throw new RuntimeException("List is Empty");
		else if(head == tail)
		{
			val = tail.data;
			head = tail = null;
			return val;
		}
		else
		{
			val = tail.data;
			tail = tail.prev;
			tail.next = null;
			return val;
		}
	}
	public void visitNext()
	{
		if(head==null)
		throw new RuntimeException("List is Empty");
		
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+"  ");
			current = current.next;
		}
	}
	public void visitPrev()
	{
		if(tail==null)
			throw new RuntimeException("List is Empty");
		
		Node current = tail;
		while(current!=null)
		{
			System.out.print(current.data+"  ");
			current = current.prev;
		}
	}
}
