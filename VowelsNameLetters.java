import java.util.Scanner;
class VowelsNameLetters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr User Name ");
		String name = sc.next().toLowerCase();
		int length = name.length();
		
		for(int i =0;i<length;i++){
			
			char ch = name.charAt(i);
	if(ch == 'a' || ch =='e' || ch =='i' ||ch =='o' ||ch =='u'){
		System.out.println( name.charAt(i));
	}
}
	}
}
