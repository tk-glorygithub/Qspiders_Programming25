class BodyMass 
{
	public static void main(String[] args) 
	{
		float OnePound = 0.45359237f;
		float OneInch = 0.0254f;
			float weight =  95.5f;
		float height = 50f ;
		float weightPound = OnePound *weight ;
		float totalheight  = OneInch*height	 ;
			float IBM = (weightPound)/ (totalheight*totalheight);  
			
		 // pounds = 95.5  height =50
		System.out.println( "IBM is  " + IBM); // 26.8573
	}
}
