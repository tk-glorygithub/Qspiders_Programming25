
class FacinatingNum_WithoutString 
{
	public static void main(String[] args) 
	{
		int num = 327;
		int dup = num;
		boolean flag = true;
		for(int i =2;i<=3;i++)
			num = (num*1000)+(dup*i);
		
		for(int i =1 ;i<=9;i++){
		int count = 0;
		for(int j =num ;j>0;j/=10){
		int rem = j%10;
		if(i ==rem)
			count++;
		}
		if(count !=1){
		flag = false;
		break;
		}
		}
		System.out.println(flag ? dup +" is Facinating number" : dup +" is Not Facinating number");
	}
}
