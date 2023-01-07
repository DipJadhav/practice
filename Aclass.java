
public class Aclass
{
	
	static int sum(int a ,int b)
	{
		int c=Bclass.sum1(a, b);
		return c;
		
	}
   public  static void main(String arg[])
   {
	   int c=Aclass.sum(2,3);
	   System.out.println("c="+c);
   }
}
