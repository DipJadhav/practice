import java.util.*;
public class swapnumber 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("Enter the a="+a);
		System.out.println("Enter the b="+b);
		
	}

}
