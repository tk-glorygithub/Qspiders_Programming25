class FrequencyNumber 
{
	public static void main(String[] args) 
	{
		Long num = 563718933324l;
		
		int HigherFreq = 0 ,SmallerFreq = Integer.MAX_VALUE;
		int higherDigit = -1 ,smallerDigit = -1;
		
		System.out.println(num);
		for(int i =0;i<=9;i++){
		 int cnt = 0;
		 for(long j = num ;j>0;j/=10){
		long rem = j%10;
		
		if(i == rem ){
		   cnt++;	
		}
			 }
		
		 if(cnt != 0){
			 System.out.println(i + " : "+ cnt);
			 
			 if(cnt > HigherFreq){
			HigherFreq = cnt;
			higherDigit = i;
			 }
			 
			 // check for lowest frequency
			 if(cnt <SmallerFreq){
			  if(cnt < SmallerFreq){
				SmallerFreq = cnt;
				smallerDigit = i;
			  }
			 }
	
		} 
		}
		 System.out.println("Highest Frequency: " + higherDigit + " appears " + HigherFreq + " times.");
        System.out.println("Lowest Frequency: " + smallerDigit + " appears " + SmallerFreq + " times.");
		
	}
}
