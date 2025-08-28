import java.util.*;


class  CollectionAddll
{
	public static void main(String[] args) 
	{
		Collection <String> list = new ArrayList<>();
		list.add("Apple");
		list.add("grapes");
		list.add("Apple");
		
			Collection <String> listA1 = new ArrayList<>();
		listA1.add("Apple");
		listA1.add("grapes");
		listA1.add("Apple");
		 
		 boolean ch = list.addAll(listA1);
		System.out.println("ArrayList"+ch
			);
		
		// using Hashset
		Collection <String> list1 = new HashSet<>();
		list1.add("Apple");
		list1.add("grapes");
		list1.add("Apple");
		boolean added = list1.add("banana");
		
		System.out.println("Hashset"+list1);
		
		// TreeSet
		Collection <String> list3 = new TreeSet<>();
		list3.add("Apple");
		list3.add("grapes");
		list3.add("Apple");
		list3.add("banana");
		
		System.out.println("treeset"+list3);
		
		//4 nullpointer exception
		try{
			Collection<Integer>tree = new TreeSet<>();
				tree.add(10);
			tree.add(null);
			
			
		}
		catch(Exception e){
		System.out.println("Error :" +e);	
		}
		
	}
}
