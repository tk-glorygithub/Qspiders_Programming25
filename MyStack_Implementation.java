import java.util.*;

//peak
//isEmpty
class MyEmptyStackException extends RuntimeException
{
	public MyEmptyStackException()
	{
	super();	
	}
}

class MyStack
{
	public static final int INITIAL_CAPACITY =10;
	E[]arr;
	int indx =0;
	
	public MyStack()
	{
	super();
	arr  =   (E[])new Object[INITIAL_CAPACITY];
	}

}

//toString
public sting toString()
{
	int data ="[";
	if(indx ==0)
	{
	return [];
	}
	for(int i =0;i<size()-1;i++)
	{
		data+=arr[i] + ", ";
		
	}
	data+=arr[size()-1];
	return data+= "]";
}

//capacity
public int capacity()


// push
public E push(E ele)
{
	if(size() ==arr.length)
	{
	E[] newArr = (E[]) new Object[newCapacity(arr.length)];
	for(int i =0;i <arr.length;i++)
		{
		newArr[i] = arr[i];
		
		}
		return newArr;
		
	}
	arr[indx++] = ele;
	return ele;
	
}
//pop

public E pop()
{
if(size ==0)
	{
	throw new MyEmptyStackException();
	}
	
	E ele = arr[size()-1];
	arr[size()-1] = null;
	indx--;
	return ele;
	
}


}
class MyStack_Implementation 
{
	public static void main(String[] args) 
	{
		Stack<Integer>st = new Stack<>();
		st.push(20);
		System.out.println(st);
		
		MyStack<Integer> stack = new MyStack<>();
		stack.push(20);
	}
}
