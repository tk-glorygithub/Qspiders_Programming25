import java.util.Scanner;
class  Evm
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp =0 ,cng =0 , ss =0 , aap=0 , mns=0, nota=0;
		System.out.println();
		System.out.println( "    WELCOME");
		System.out.println();
		System.out.println(" ENTER THE POPULATION");
		
		int population = sc.nextInt();
		
		for(int i =1; i<=population ;i++){
			
			System.out.println();
			System.out.println(" **List the Parties**");
			System.out.println(" 1. BJP");
			System.out.println(" 2. Congress");
			System.out.println(" 3. Shiv Sena");
			System.out.println(" 4. AAP");
			System.out.println(" 5. MNS");
			System.out.println(" 6. NOTA");
			System.out.println( );
			System.out.println(" Enter the Option");
			int opt = sc.nextInt();
			
			if(opt ==1){
				bjp++;
				System.out.println(" Ache Din AAyenge");
			}
			if(opt ==2){
				cng++;
				System.out.println("BHARAT TODO");
			}
			if(opt ==3){
				ss++;
				System.out.println(" HUM HAI ASLI SENA");
			}
			if(opt ==4){
				aap++;
				System.out.println(" Muze AZAD KARO");
			}
			if(opt ==5){
			    mns++;
				System.out.println(" JAI MAHARASHTA");
			}
			if(opt ==6){
				nota++;
				System.out.println(" You ARE AN EDUCATED PERSON");
			}
			
			System.out.println();
		
		if(!(opt>=1 && opt<=6)){
		    i--;
		System.out.println("Invalid Option");
		}
		
		}
		if(bjp >=cng && bjp >=ss && bjp >=aap && bjp >=mns && bjp >=nota  ){
		 	System.out.println(" BJP has Won  THE ELECTION BY" + bjp + "Votes");
		}
	
		
		if(cng >=bjp && cng >=ss && cng>=aap && cng >=mns && cng >=nota  ){
		 	System.out.println(" cng has Won  THE ELECTION BY" + cng + "Votes");
		}
		
		if(ss >=bjp && ss >=cng && ss>=aap && ss >=mns && ss >=nota  ){
		 	System.out.println(" ss has Won  THE ELECTION BY" + ss + "Votes");
		}
		
		if(aap >=bjp && aap >=ss && aap>=cng && aap >=mns && aap >=nota  ){
		 	System.out.println("aap has Won  THE ELECTION BY" + aap + "Votes");
		}
		if(mns >=bjp && mns >=ss && mns>=aap && mns >=cng && mns >=nota  ){
		 	System.out.println(" mns has Won  THE ELECTION BY" + mns + "Votes");
		}
		if(nota>=bjp && nota >=ss && nota>=aap && nota >=mns && nota>=cng  ){
		 	System.out.println(" Nota has Won  THE ELECTION BY" + nota + "Votes");
		}

}
	}

