
public class subsequence 
{
	public static void main(String args[])
	 {
		System.out.println("output="+fun("abc","ahbgdc"));
	 }

	private static boolean fun(String s, String t) {
	

		int n = s.length(), m = t.length();
	    int i = 0, j = 0;
	    while (i < n && j < m) {
	        if (s.charAt(i) == t.charAt(j))
	        {	  System.out.println("s.charAt(i)=="+s.charAt(i) +" t.charAt(j)=="+t.charAt(j));
	            i++;
	        }
	        j++;
	    }
	    /*If i reaches end of s1,that mean we found all
	    characters of s1 in s2,
	    so s1 is subsequence of s2, else not*/
	    return i == n;
		
		
		
		
		
	/*	 int flag=0;
		 boolean flag1=false;
		 int j=0;
		 if(s.length()==0)
			{
				return true;
			}
			
	  if(t.length()>0)
			  { 
		  
		  	for (int i=0;i<s.length();i++)
			  
			       {
			    	   System.out.println("contains at 1st="+flag);
			          for (j=flag;j<t.length();j++)
			               {
			        	  System.out.println("s.charAt(i)=="+s.charAt(i) +" t.charAt(j)=="+t.charAt(j));
			        	  
			                   if(s.charAt(i)==t.charAt(j))
			                   {
			                         flag=j+1;
			                         System.out.println("contains at 2nd="+flag);
			                         flag1=true;
			                         break;
			                         
			                   }
			                   else
			                   {
			                	  
			                	   flag1=false;
			                	   
			                   }
			                 
			                   
			                    
			               }
			          
			          if(j==(t.length()-1))
               	   {
               		   return false;
               	   }
			       }
				return flag1;
		
	}
	else
	{
		
		return false;
		  
	}*/
		
		
	   
	  }
}
