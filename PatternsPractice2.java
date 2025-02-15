import java.util.Scanner;

class PatternsPractice2 
{
	public static void main(String[] args) 
	{
		System.out.println(" Enter the number");
		int n = new Scanner(System.in).nextInt();
		for(int i =0;i<n;i++){
			for(int j = 0;j<n;j++){
				
				//if(i==0 || j==0 || i==n-1  || j ==n-1 || i==j    || i+j == n-1  ||  )
				//if(i ==n/2 ||j == n/2  ||i==0 && j>n/2 ||j==0 && i<n/2 || i==(n-1) && j <n/2  || j==(n-1) && i>n/2 || i==j || i+j == n-1)
				if(i==n/4 ||j ==n/4 || j==(n/2 +n/4) || i ==(n/2 +n/4) || i==0 && j >(n/2 +n/8) || j==0 && i>(n/2 +n/8) ||i ==0 && j<n/4 || i==(n-1) && j<(n/4)  || i==(n-1) && j>(n/2 +n/4) || j==(n-1) && i>(n/2 +n/4)|| i==(3*n/4)+n/8 && j ==n/8)
				{
			System.out.print("*" +" ");
		}
		else{
			System.out.print(" "  + " ");
		}
			}
		System.out.println();
		}
		
	}
}
