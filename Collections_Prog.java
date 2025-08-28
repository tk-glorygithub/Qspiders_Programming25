import java.util.*;
class Collections_Prog 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		
		Collection c = new HashSet();
		c.add(10);
		c.add(20);
		c.remove(20);
		
		System.out.println(c);
		
		Collection d = new HashSet();
		d.addAll(Arrays.asList(40,5,89));
		System.out.println(d);
	}
}
