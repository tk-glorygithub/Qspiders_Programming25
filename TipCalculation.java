import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("Enter the Bill: ");
		float bill = new Scanner(System.in).nextFloat();
		System.out.println("Enter the TipRate: ");
		
		float tipRate = new Scanner(System.in).nextFloat();
		float tipAmount = (tipRate*bill)/100;
		float totalBill = bill*tipAmount;
		System.out.println("Total Bill is : " + totalBill);
		System.out.println(" Tip Amount is : "+tipAmount);
		
	}
}
