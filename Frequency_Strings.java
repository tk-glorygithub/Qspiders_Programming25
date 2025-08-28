import java.util.Arrays;

class Frequency_Strings 
{
	public static void main(String[] args) 
	{
		String str1 = "Trushnaarya";
		String str = str1.toLowerCase();
		char[]arr2 = charArr(str);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		//int max = Integer.MIN_VALUE
		
		//System.out.println(Arrays.toString(arr2));
		char val = ' ';
		char val2 = ' ';
		boolean b[] = new boolean[arr2.length];
		
		for(int i =0;i<arr2.length;i++){
			if(b[i])continue;
			int count = 0;
			for(int j =i;j<arr2.length;j++){
			if(arr2[i] == arr2[j]){
			count++;
			b[j] = true;
			}
			}
			if(count >max)
			{
			 max = count;
			 val = arr2[i];
				
			}
			if(count <min)
			{
			 min = count;
			 val2 = arr2[i];
				
			}
			
		}
		System.out.println(val + "   " + max);
			System.out.println(val2 + "   " + min);
		
		
	}
	public static char[] charArr(String str){
	char arr[] = new char[str.length()];
	for(int i =0;i<str.length();i++){
		arr[i] = str.charAt(i);
		
	}
	return arr;
		
	}
}
