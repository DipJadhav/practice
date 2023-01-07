import java.util.*;

public class leapYear 
{
	
	
	public int fun()
			{
		try
			{
				int a=10/0;
				return 9;
			}catch(Exception e)
			{
				return 10;
			}
		      finally
		      {
		    	  return 11;
		      }
			}
	public static void main(String args[])
	{
		
		leapYear l=new leapYear();
		
		
		System.out.println("Enter the number"+l.fun());
		/*	Scanner sc =new Scanner(System.in);
			
			int year=sc.nextInt();
			
			if((year%4==0) && (year%100!=0) || (year%400==0))
			{
				System.out.println("Specified year is a leap year");
			}
			else
			{
				System.out.println("Specified year is not a leap year");
			}*/
		
		/*	String s="1234";
			int a=0;
			int m=Integer.parseInt(s); 
			for(int i=0;i<s.length();i++)
			{ 
			
			}*/
		
		
			
	
	}
}
