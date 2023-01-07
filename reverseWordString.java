
public class reverseWordString {

	
	
	public static void main(String args[])
	   {
		 int d;
		
		String s="a good   example";
		
               String arr1[]=s.trim().split("\\s+");
        String rev="";
        for(int i=arr1.length-1;i>=0;i--)
        {
        	
        	System.out.println("arr["+i+"]="+arr1[i]); 
        	if(i==0)
        	{
        		rev=rev+arr1[i];
        		 System.out.println("inside="+i); 
              }
        	else
        	{	
        	rev= rev+arr1[i]+" ";
        	}
        }
        System.out.println("rev="+rev); 
	   }
}
