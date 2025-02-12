class cenus
{
	public static void main(String[] args) 
	{
		Long CurrPop = 312032486l;
		
		final Long seconds = (365*24*60*60)*5l;
		Long Birth = seconds/7;
		Long Death = seconds/13;
		Long  Imm = seconds/45;
		
		Long newPop = CurrPop +Birth-Death+ Imm;
		System.out.println("Current Population is " +  CurrPop);
		System.out.println("New Population is " +  newPop );
			
	}
}
 