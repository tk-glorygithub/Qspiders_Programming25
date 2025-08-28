import java.util.*;

class  ElementNotFoundException extends RuntimeException
	{
		public ElementNotFoundException(String desc){
		super(desc);	
		}
		
	}
	
class MyLinkedList<E> 
{
	
	Node<E>head;
	Node<E> tail;
	int indx;
	
	private class Node<E>
	{
		E ele;
		Node<E> next;
		
	
	public Node(E ele){
		this.ele = ele;
	}
	}
	
	@Override
		public String toString(){
		String data ="[";
		if(indx ==0){
		return "[]";
		
		}
		else{
		Node<E> currNode = head;
		for(int i =0;i<indx-1;i++){
		data +=currNode.ele + ", ";
		currNode = currNode.next;
			
		}
		data += currNode.ele;	
		}
		return data+ "]";
	}
	
	// add
	public void add(E ele){
	Node<E> newNode = new Node<>(ele);
	if(indx ==0){
	head = newNode;	
	tail= newNode;
	}
	else
	{
	Node<E>currNode = head;
	while(currNode.next!=null)
		{
		currNode = currNode.next;
		
		}
		currNode.next = newNode;
		tail = newNode;
		
	}
	
	indx++;
	
		
	}
	// size
	public int size()
	{
		return indx;
		
	}
	
	//addFirst
	public void addFirst(E ele)
	{
	Node<E> newNode = new Node<>(ele);
	if(head == null)
		{
		head = newNode;
		
		}
		else{
		newNode.next= head;	
		head = newNode;	
		}
	
		indx++;
	}
	
	//get first element
	public E getFirst(){
		if(indx==0){
	throw new ElementNotFoundException("empty linkedlist");
		}
		return head.ele;	
	
	}
	// get last element
	   public E getLast(){
		if(indx==0){
	   throw new ElementNotFoundException("empty linkedlist");
	
		}
		return tail.ele;	
	
	   }
	
	//remove last 
	
	public E removeLast(){
	if(indx ==0)
		 throw new ElementNotFoundException("empty linkedlist");
	
	 E temp  = tail.ele;
	 Node<E> currNode = head;
	 for(int i =0;i<size()-1;i++)
		{
		 
		 currNode = currNode.next;
		}
		currNode.next = null;
		
		tail = currNode;
		 if(indx ==0)
	      head = null;
		 indx--;
		 return temp;
			
	}
	
	//remove first
	public E removeFirst()
	{
	if(indx ==0)
		 throw new ElementNotFoundException("empty linkedlist");	
	
	E temp = head.ele;
	
	head = head.next;
	
	if(indx ==1 ){
	tail = null;		
	}
	indx--;
	return temp;
	
	}
	
	
	//set
	public E set(int indx , E ele)
	{
	if(indx <0 || indx >size())	
		throw new ElementNotFoundException("Index : "+indx +" ,size :" +size());
	
	   Node<E> currNode = head;
	   for(int i =0;i<indx;i++)
		{
		 currNode = currNode.next;  
		   
		}
		E temp = currNode.ele;
		currNode.ele = ele;
		return temp;
	}
	// indexof 
	public int indexOf(E ele){
		
		int cnt= 0;
		
		for(int i =0;i<size();i++){
	       if(head.ele!=ele){
			cnt++;
		   }
		   else{
			   
			return cnt-1;   
		   }
		   	head = head.next;
		}
	
		return -1;
	}
	
	//last Index of
	public int lastIndexOf(E ele){
	   Node<E> currNode = head;
		int cnt= 0;
		int max =0;
		for(int i =0;i<size();i++){
			if(currNode==null)break;
	       if(currNode.ele ==ele){
			max=cnt;
		   }
		    cnt++;
		   	currNode =currNode.next;
		}
	
		return max;
	}
	public boolean contains(E ele){
		
		 Node<E> currNode = head;
		
		for(int i =0;i<size();i++){
			if(currNode==null)break;
	       if(currNode.ele ==ele){
			return true;
		   }
		   currNode = currNode.next;
		    
		}
	
		return false;
		
	}
	// clear
	public void clear(){
		head.next= null;
		head = null;
		tail= null;
		indx=0;
		
	}
	
}



class  List_Implementation
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println("________________");
		
		MyLinkedList<Integer> o = new MyLinkedList<>();
		System.out.println(o);
		o.add(10);
     	o.add(20);
		o.add(30);
		o.add(40);
		o.add(50);
		o.add(50);
		o.add(60);
		System.out.println(o.size());
		/*System.out.println(o.toString());
		System.out.println("get the first element "+o.getFirst());
		System.out.println("get the last element "+o.getLast());
		 o.addFirst(1200);
		 		 System.out.println(o);
		 System.out.println(" Remove Last element "+o.removeLast());
		 System.out.println(o);
		
     System.out.println("SET  ele " +o.set(2,78));
		System.out.println(o);
		System.out.println("index of the element "+o.indexOf(-1)); */
		System.out.println("Last index of the element "+o.lastIndexOf(50));
		System.out.println(o.contains(47));
		o.clear();
		System.out.println(o);
		
	}
}
