import java.util.Arrays;

class String_Anagram 
{
	public static void main(String[] args) 
	{
		String str1= "hello";
		String str2= "llohe";
		
		if(isAnagram(str1,str2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		
	}
	public static boolean isAnagram(String ...str){
		
	if(str[0].length() != str[1].length()) return false;
	 char[] arr1 = str[0].toCharArray();
	  char[] arr2 = str[1].toCharArray();	
	  bubbleSort(arr1);
	  bubbleSort(arr2);
	  
	  for(int i =0;i<arr1.length;i++){
		if(arr1[i] != arr2[i])  return false;
		
	  }
		return true;
		  
	  
	}
	public static void  bubbleSort(char[]arr){
		
	for(int i =0;i<arr.length;i++){
	for(int j =i+1;j<arr.length;j++)
		{
		if(arr[i] >arr[j]){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
			
		}
		
		}
		
	}
		
	}
}
