
public class staticVariable 
{
	 private static int x = 100;
	public static void main(String arg[])
	{
		staticVariable hs1 = new staticVariable();
	        hs1.x++;
	          
	        staticVariable hs2 = new staticVariable();
	        hs2.x++;
	          
	        hs1 = new staticVariable();
	        hs1.x++;
	          
	        staticVariable.x++;
	        System.out.println("Adding to 100, x = " + hs1.x);
		
	}
	
}
