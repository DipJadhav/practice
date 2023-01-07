import java.util.*;
public class armstrongNumberCheck 
{
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		ArrayList<Integer> ar=new ArrayList<>();
		//break the number into digits 
		int count=0;
		int temp=number;
		int reverse=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
			System.out.println("the temp"+temp);
			
		}
		System.out.println("Enter the count"+count);
		
		while(number>0)
		{
			reverse=number%10;	
			ar.add(reverse);
			System.out.println("the reverse="+reverse);
			number=number/10;
			System.out.println("the number="+number);
		}
		System.out.println("the ar="+ar);
		
		int m=0;
		int n=0;
		//now check number is armstrong or not 
		for(int i=0;i<ar.size();i++)
		{
			n=ar.get(i);
			
			
			m=m+n*n*n;
			System.out.println("sum m="+m);
		}
		
		if(m==number)
		{
			System.out.println("Yes it is armstrong");
		}
		else
		{
			System.out.println("Yes it is not armstrong");
		}
		
	}

}

