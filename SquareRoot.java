import java.util.Scanner;
class SquareRoot 
{
	//Scanner sc = new Scanner(System.in);
	//System.out.println(" Enter the number");
	//int num = sc.nextInt();
	
	
	
	public static void main(String[] args) 
	{
		int value =100;
		boolean  flag = false;
		for(int i =1; i <= value ;i++){
		
			if(i*i == value){
				flag = true;
				//System.out.println( i*i);
				System.out.println( i + " is The  perfect Sqrt Root is " + value);
			}
			if(i*i > value)
				break;
		}
		
		if(!flag)
		
		
			System.out.println(value + " is  not having  perfect sqrt value  ");
			
		
		
		
	}
}
