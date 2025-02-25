import java.util.Scanner;
class  FrequencyCharacter 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Word");
		String word = new Scanner(System.in).next();
		 int HigherFreq = 0 ,SmallerFreq = Integer.MAX_VALUE;
		char HighChar ='0';
	char LowChar ='0';
		
		for(char ch ='a' ;ch<='z';ch++){
			int count =0;
			for(int j=0;j<word.length();j++){
			char cha =word.charAt(j);
			if(ch == cha){
				count++;	
			}
			}
			if(count !=0){
			System.out.println(ch + " : " + count);
			
			if(count> HigherFreq){
				HigherFreq= count;
				HighChar= ch;
			}
			if(count< SmallerFreq){
				SmallerFreq= count;
				LowChar= ch;
			}
		}
		}
		System.out.println(HighChar + " appears for "  +  HigherFreq  );
		System.out.println(   LowChar + " appears for " + SmallerFreq);
	}
}
