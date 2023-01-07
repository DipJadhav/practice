
public class staticMethod 
{
	static int a;
    
   
	 static
	 {
	 	   System.out.println ("inside block");
	 }
	 static void fun()
	 {
		 System.out.println ("ninside fun");
	 }
    staticMethod()
    {
        System.out.println ("ninside constructorn");
       
    } 
    public static void main(String arg[])
    {
    	System.out.println ("main method ");
    	staticMethod obj = new staticMethod();
    	
    	obj.fun();
    	
    }
   
}
