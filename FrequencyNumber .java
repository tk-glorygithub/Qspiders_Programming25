class FrequencyNumber 
{
	public static void main(String[] args) 
	{
		Long num = 56371890324;
		
		System.out.println(num);
		for(i =0;i<=9;i++){
		 int cnt = 0;
		 for(long j = num ;j>0;j/10){
		long rem = j%10;
		if(i == rem ){
		cnt++;	
		}
		
		 }
		 if(cnt != 0){
			 System.out.println(i + " : "+ cnt);
		 }
		}
	}
}
