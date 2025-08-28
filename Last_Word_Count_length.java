import java.util.Arrays;

class Last_Word_Count_length 
{
	public static void main(String[] args) 
	{ int count=0;
		
		String str = "Hello World";
		String str1 = str.trim();
		for(int i =str.length()-1;i>=0;i--){
			if(str1.charAt(i) !=' '){
				count++;
				
			}else{
			break;	
			}
		}
		System.out.println(count);
		
		
	} 

	
}
