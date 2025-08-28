import java.util.Arrays;

class SortCharacter_Alphabetically 
{
	public static void main(String[] args) 
	{
		String str = "Helloworld".toLowerCase();
		Sort(str);
		
	}
	public static void Sort(String str){
	char ch[] = str.toCharArray();
	System.out.println(bubblesort(ch));
			
	}
	public static char[] bubblesort(char ch[]){
	for(int i =0;i<ch.length;i++){
	for(int j = i+1;j<ch.length;j++){
	if(ch[i] >ch[j]){
	char temp = ch[i];
	ch[i] = ch[j];
	ch[j]= temp;
	}
	}
		
	}
	return ch;
		
	}
}
