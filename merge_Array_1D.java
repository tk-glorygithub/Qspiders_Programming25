import java.util.Arrays;

class merge_Array_1D 
{
	public static void main(String[] args) 
	{
		int arr1[] ={2,3,7,8};
		int arr2[] ={6,9,1};
		int max = arr1.length>arr2.length? arr1.length:arr2.length;
		int c[] = new int[arr1.length + arr2.length];
		
		for(int i = 0,idx=0 ;i<max;i++){
		if(i<arr1.length){
			
		c[idx++] = arr1[i];	
		}
		else if(i<arr2.length){
			
		c[idx++] = arr2[i];	
		}
		}
		System.out.println(Arrays.toString(c));
		
	}
	
}
