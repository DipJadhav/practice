


public class test1 
{
	public static void main(String arg[])
	{
       String s="12";
       String s2="10";
       int b=0;
        int s1=Integer.parseInt(s);
        
        for (int i=0;i<s.length();i++)
        {
        	 b=b+s.charAt(i)-'0';
        	}
        
        System.out.println("b==="+b);
        
        
        
        String a="hello";
        String c="hello";
        
        System.out.println(a==c);
        System.out.println("check "+a==c);
        
        System.out.println(s+s2);
        
        
        String m=50+30+"Sachin"+40+40;  
        System.out.println(m);//80Sachin4040  
	}
	
	
	
	
	
    
}
