import java.util.*;

class NoSuchElemenetFoundException extends RuntimeException
{
	NoSuchElemenetFoundException()
	{
	super();	
		
	}
	
}

class  DoublyLinkedList
{
	Node<E>head;
	Node<E>tail;
	int indx;
	
	private class Node
	{
		E ele;
		Node<E> prev;
		Node<E> next;
		public Node(Node<E> prev, E ele)
		{
		this.prev = prev;
		this.next = next;
			
		}
	}
	
	//toString
	@Override
	public String toString()
	{
		
		String data = "[";
		Node<E> currNode = head;
		if(indx ==0){
		return "[]";
			
		}
		else{
		while(currNode.next!= null){
		data +=currNode.ele + ", ";
		currNode = currNode.next;
				
		}
		return data += currNode.ele +"]";
			
		}
		
	}
	
	// addLast
	public void addLast(E ele){
	Node<E> newNode = new Node<E>(tail,ele);	
	if(indx == 0)
		{
		head = newNode;
		tail = newNode;
		
		}
		else{
		tail.next = newNode;
		tail = newNode;
			
		}
		indx++;
	}
	
	//addFirst
	public void AddFirst(E ele)
	{
	
		if(indx == 0)
		{
	   addLast(ele);	
		return;
		}
		else{
		Node<E> newNode = new Node<E>(null,ele);	
		newNode.next= head;
		head.prev = newNode;
		head = newNode;
		indx++;
		}
	}
	// removeFirst
	public E removeFirst()
	{
		if (indx ==0)
		{
			if(indx ==0){
				throw new NoSuch24-08-202524-08-2025ElemenetFoundException();
				
			}
			E temp = head.ele;
			head = head.next;
			head.prev = null;
			indx--;
			
			return temp;
		}
	}
	
	// removeLast
	public E removeLast()
	{
		if (indx ==0)
		{
			if(indx ==0){
				throw new NoSuchElemenetFoundException();
				
			}
			E temp = head.ele;
			head = head.next;
			head.prev = null;
			indx--;
			
			return temp;
		}
	}
}


class  DoublyLinkedList
{
	public static void main(String[] args) 
	{
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println("Add "+listaddLast(30));
	}
}
