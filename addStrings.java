
public class addStrings
{
	public static void main(String args[])
	{
		String a="229";
		String b="29";
		
		//a=new StringBuilder(a).reverse().toString();
		//b=new StringBuilder(b).reverse().toString();
		if(a.length()>b.length())
		{
			for(int i=0;i<a.length()-b.length();i++)
			{
				b='0'+b;
			}
			
			
		}
		else
		{
			for(int i=0;i<b.length()-a.length();i++)
			{
				a='0'+a;
			}
		}
		
		
		System.out.println("a="+a.length()+"b="+b.length());
		
		int sum=0;
		int i=a.length()-1;
		int carry=0;	
		
		String sum1="";	
		
			while(i>=0)
			{
                  
				int c=a.charAt(i)-'0';
				    int d=b.charAt(i)-'0';
					sum=c+d+carry;
                    carry=sum/10;
					sum1=sum%10+sum1;
                    i--;

			}
		
			System.out.println(sum1);
		
		
	
		
	}
}
