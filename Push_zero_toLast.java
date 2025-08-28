import java.util.Arrays;

class Push_zero_toLast 
{
	public static void main(String[] args) 
	{                
		          // 0 1 2 3 4 5 6 7 8 9  10
		int arr[] = {2,0,4,0,0,4,5,0,2,25,9};
		for(int i = 0;i<arr.length;i++){
			if(arr[i] ==0){
			 for(int j = i+1 ;j<arr.length;j++){
			if(arr[j]!=0 ){
				arr[i] = arr[j];
				arr[j] =0;
				break;
				
			 }
		}
		}
		}
		System.out.print(Arrays.toString(arr) + "  ");
	
	}
}

