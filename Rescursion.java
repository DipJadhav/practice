
public class Rescursion 
{
	
	
	 static void fun(int n)
	{
		 if(n==0)
			 return;
		System.out.print(" "+n);
		fun(n-1);
		
	}
	
	
	public static void main(String args[])
	 {
		int max=9;
		fun(9);
		
	 }
	 
}
