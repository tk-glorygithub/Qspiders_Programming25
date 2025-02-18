class FacinatingNumber 
{
	public static void main(String[] args) 
	{  
		
		for(int num =0;num<= 10000;num++){
		//int num = 327;
		String str = num+""+(num*2)+(num*3);
		boolean flag = true;
		// loop which start from 1 to 9 character
		for(char i ='1' ;i <='9';i++){
		int cnt =0;
		
		for(int j =0;j<str.length();j++){
		char ch = str.charAt(j); // char fetch is stored in var ch 
		if(ch ==i)  //if i  char matches with ch  char if executes
			cnt++;
		}
		if(cnt != 1) // if cnt of char is not equals to 1 then if executes
			{
		flag = false;
		break;
		
		}
		}
		if(flag ){
		System.out.println(num + " is Facinating Number");	
		}
		//else{
		//System.out.println( num +" is Not Facinating Number");	
		//}
		}
	}
}
