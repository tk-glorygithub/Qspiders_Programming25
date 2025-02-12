class  swap
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 60;
		System.out.println("Values Before Swapping");
			System.out.println("A = " + a);
		System.out.println("B =" + b);
		
		int temp = a;
		a =b;
		b = temp;
		
		System.out.println("Values After Swapping");
			System.out.println("A = " + a);
		System.out.println("B =" + b);
		{
		// swap without the temp
		System.out.println("Swap without temp");
		System.out.println("Values Before Interchange");
		
		int c = 10;
		int d = 5;
			System.out.println("C" + c);
				System.out.println("D" + d);
		 c= c+d;
		 d = c-d;
		 c = c-d;
		System.out.println("C" + c);
		System.out.println("D" + d);
		System.out.println("Values Interchanged");
		
		}
	}
}
