import java.util.Arrays;

class ArraysFactorial 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for(int i =0;i<arr.length;i++){
		arr[i] = fact(arr[i]);	
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int fact(int num){
	if(num ==1 || num==0){
	return num;
	}
	return num*fact(num-1);
	}
}
