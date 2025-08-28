import java.util.Arrays;

class Reverse_String 
{
	public static void main(String[] args) 
	{
		String str = "Trushna";
		String val ="";
		//char ch[] = new char[str.length()];
		for(int i = 0 ;i <str.length() ;i++){
			
			val = str.charAt(i)+val;
		}
		System.out.println(val);
	}
}
