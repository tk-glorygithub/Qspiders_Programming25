import java.util.*;
class DogBark 
{
	public static void main(String[] args) 
	{ 
		String s=new Scanner(System.in).nextLine();
		StringBuilder sb=new  StringBuilder();
        HashSet<String>set=new HashSet<>();

		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);

			if(ch=='.' ){
				if(sb.length()>0){
			//	set.add(sb.toString());
			System.out.println(i+"="+sb.toString()+" length="+sb.length() );
                sb.setLength(0);
				}
			}else{
				sb.append(ch);
		    }
		}
		if(sb.length()>0){
				set.add(sb.toString());
              
			}
         System.out.println(set.size());

	}
}