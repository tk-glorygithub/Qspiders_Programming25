import java.util.Arrays;

class String_Change_FirstLetter_Case 
{
	public static void main(String[] args) 
	{
		String str = "hello good morning";
		String[]word = str.split(" ");
		for(int i = 0;i<word.length;i++){
			System.out.println(wordFirst(word[i]));
			
		}
		
	}
		public static String wordFirst( String str){
			String ans =" "; 
		      char ch[]= str.toCharArray();
			  if(!(ch[0] >=65 && ch[0]<=97)){
				ch[0] = (char)(ch[0]-32);
				
			}
			ans+= new String(ch);
			return ans;
			
		}
	
}
