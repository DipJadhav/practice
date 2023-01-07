import java.util.LinkedList;


public class reverseString 
{
   public static void main(String args[])
		   {
	   
	   
	   //reverse string 
		         String s =" dipashri jadhav";
		         char arr[]=s.toCharArray();               
		         String rev="";
		         for(int i=arr.length-1;i>0;i--)
		         { 
		        	 rev=rev+arr[i];
		         }
		               
		        System.out.println("rev="+rev); 
		        
//reverse single word string  
		        //1
		        
		        String arr1[]=s.split(" ");
		        
		       String rev1="";
		        for(String w:arr1)
		        {
		        	
		        	w.toCharArray();
		        	StringBuilder sb =new  StringBuilder(w);
		        	sb.reverse();
		        	rev1=rev1+sb+" ";
		        	
		        }
		        System.out.println("rev1="+rev1); 
		        
		        //remove duplicate cchar from String 
		        
		        String S3= "javaTpoint is the best learning website";
		        
		        LinkedList<Character> ch = new LinkedList<Character>();
		       for(int i=0;i<S3.length();i++)
		       {
		           if(!ch.contains(S3.charAt(i)))
		           {
		    	      ch.add(S3.charAt(i));
		           }
		       }
		        
		       for(int i=0;i<ch.size();i++)
		       {
		    	   System.out.print(ch.get(i)); 
		       }
		       
		        String s1="Dip";
		        String s2="Jad";
		        System.out.println("sring ========"+s1.concat(s2)+"  s1=="+s1+"  s2=="+s2);
		     s1 = s1.concat(s2);
		     System.out.println("sring ========"+s1.concat(s2)+"  s1=="+s1+"  s2=="+s2); 
		   }
}
