import java.util.Scanner;

class StonePaperScissor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rNum =0;
		for(; ;)
		{
		int num = (int)(Math.random()*10);
		if(num >= 1 && num <=3)
			{
			rNum = num;
			break;
			}
		}
		
  String codeOpt = null;
  if(rNum ==1) {
	  
	codeOpt = "STONE";  
	  
  }
  else if(rNum ==2){
	  	codeOpt = "PAPER";  
  }
  
   else if(rNum ==3){
	  	codeOpt = "SCISSOR";  
  }
  
  System.out.println();
  
	}
}
