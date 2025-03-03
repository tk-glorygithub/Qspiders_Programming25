class MethodProgram3 
{
	public static void main(String[] args) 
	{
		for(int i = 1;i<=100;i++){
		if(IsPrime(i)){
			System.out.print(i + " ");
		}
		}
	}
	public static boolean IsPrime(int num){
	 int i =2;
	 for(;i<num;i++){
		if(num%i ==0)
		 {
		 return false;	
		 }
		 
	}
	return true;
}
}
