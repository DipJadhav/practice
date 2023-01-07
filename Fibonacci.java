
public class Fibonacci 
{
	
	
	public static int fibonacci(int n) {
		System.out.println("n===="+n);
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibonacci(n));
		
	}

  /* public static void main(String args[])
   {
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	/*int count =30;
   
   int a=1;
   int b=0;
   int c=0;
   for(int i=1;i<count;i++)
   {
	   
	  
	   System.out.println("fibbernic==="+b);
	   c=b+a;
	   a=b; 
	   b=c;
	  
	   
   }
   }*/
   
}
