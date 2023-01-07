
public class Edit_Distance {

	
	
	public static void main(String args[])
	{
		  String s1="horse";
		  String s2="ros";
		  String s3="";
		  int count=0;
		 for(int i=0;i<s1.length();i++)
		 {	 
			if(s2.contains(s1.subSequence(i, s1.length())))
			{
				System.out.println(s2.contains(s1.subSequence(i, s1.length())));
				i++;
			}
			else
			{
				System.out.println(s2.contains(s1.subSequence(i, s1.length())));
				char a=s2.charAt(i);
			
	      		char b=s1.charAt(i);
	      		System.out.println(" a="+a+" b="+b); 
				count++;
				
			}
			 
		 }
		 
		 System.out.println(count);
		  
	}
}
