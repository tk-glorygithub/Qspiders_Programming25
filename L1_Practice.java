
class  ElementNotFoundException extends RuntimeException
	{
		public ElementNotFoundException(String desc){
		super(desc);	
		}
		
	}
		
class MyLinkedlist<E>
{
	
	Node<E>head;
	Node<E>tail;
	int indx= 0;
	
	private class Node<E>
	{
		E ele;
		Node<E>next;
		
		public  Node(E ele){
		this.ele = ele;	
			
		}
	}
	//Override
	public String toString(){
	String data = "[";
	if(indx ==0){
     return "[]";
		
	}
	else{
		Node<E>curr = head;
	for(int i =0;i<indx-1;i++){
		data +=curr.ele + ", ";
	   curr = curr.next;	
	}
	data += curr.ele;
		
	}
	return data+"]";
		
	}
	// add
	public void add(E ele){
	Node<E> newnode = new Node<>(ele);
	if(indx==0){
	head = newnode;
	tail= newnode;
		
	}
	else{
	Node<E> elem = head;
		while(elem.next !=null){
		elem = elem.next;	
		}
		elem.next = newnode;
		tail = newnode;
			
		}
		indx++;
		
	}
	// get first
	public E getFirst(){
		if(indx==0){
	throw new ElementNotFoundException("empty linkedlist");	
		
	}
		return head.ele;
		
	}

// get last
    public E getLast(){
		if(indx==0){
	throw new ElementNotFoundException("empty linkedlist");	
		
	}
		
	
		return tail.ele;
		
	}
	//add first
	 public E addFirst(E ele){
	Node<E> first = new Node<>(ele);
		if(head == null){
	first = head;
	}
	else{
		
	first.next = head;	
	head
	}
	return head;
	
		indx++;
	} 
	
	//remove
	
	// remove middle
	
	//add middle
	
	//
}


class  L1_Practice
{
	public static void main(String[] args) 
	{
		MyLinkedlist<Integer> l = new MyLinkedlist<>();
		System.out.println(l);
		l.add(20);
		l.add(200);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l);
		System.out.println(l.addFirst(13));
		
	}
}
