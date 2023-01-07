
public class MultiplyStrings
{
	
	public static void main(String args[])
	{int var=0;
	int  var1=0;
		String num1="234";
		int j=10;
		int k=0;
		ReverseInteger obj=new ReverseInteger();
		obj.dip();
		for(int i=0;i<num1.length();i++)
		{	
			
		
			System.out.println("k="+k);
			 var1=var1*10+var1;
           var1=num1.charAt(i)-'0';
          
		   System.out.println("var1="+var1);
		  
		}
		 System.out.println("var="+var);
		 
		
	}

}
