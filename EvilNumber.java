import java.util.Scanner;

class EvilNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String bin = "";
		for(int i = num;i>0;i/=2)
		{
		bin = (i%2)+bin;	
		}
		int count = 0;
		for(int i =0;i<bin.length();i++)
		{
		char ch = bin.charAt(i);
		if(ch =='1')
			count++;
			
		}
		if(count %2 ==0){
		System.out.println(num + " is EvilNumber");	
		}
		else{
			System.out.println(num + " is not EvilNumber");	
		
		}
	}
}
