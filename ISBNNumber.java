
class ISBNNumber 
{
	public static void main(String[] args) 
	{
		
		int sum =0;
		long num = 1259060977l;
		for(long i= num ,j=1; i>0; i/=10 ,j++){
		long rem = num%10;
		sum +=(rem*j);
		}
		if(sum %11 ==0){
			System.out.println(num + " is Valid ISBN number");
		}
		else {
			System.out.println(num + " is not Valid ISBN number");
		}
	}
}
