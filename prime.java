// series - 

import java.util.Scanner;
class prime 
{
	
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter Range1 (Lower Bound): ");
        int Range1 = sc.nextInt();
        System.out.print("Enter Range2 (Upper Bound): ");
        int Range2 = sc.nextInt();

        System.out.println("series Prime Numbers between " + Range1 + " and " + Range2 + ":");

        for (int i = Range1; i <= Range2; i++) {
            // Step 1: Check if the number is prime
            boolean isPrime = true;
            if (i < 2) continue; // Skip numbers < 2
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
           System.out.print( i + " ");
		   
		}
		
		
	}
}
}
