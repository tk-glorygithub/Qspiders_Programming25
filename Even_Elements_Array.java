import java.util.Arrays;

class Even_Elements_Array 
{
	public static boolean iseven(int arr){
		
		if(arr %2 ==0){
		return true;	
		}
		else return false;
			
		}
		
	public static void main(String[] args) 
	{
		int arr[] = {18,8,2,3,5,4,7,6,9,0};
		for(int i = 0;i<arr.length;i++){
		if(iseven(arr[i])){
		System.out.print(arr[i] + "  ");	
		}
		
		}
		
	}
}
