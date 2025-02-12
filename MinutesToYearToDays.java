class MinutesToYearToDays 
{
	public static void main(String[] args) 
	{
		System.out.println("Convert Minutes int years & days");
		int minute = 1000000000;
		int MinutesDay =24*60;
		int MinutesYear = 365*MinutesDay;
		int  Years = minute/MinutesYear;
		int RemaingMinutes = minute%MinutesYear;
		int days= RemaingMinutes/MinutesDay;
		System.out.println("Minutes in year are  " + " "+  Years + " "+   "Minutes in days are  "  +days);
			
	}
}
