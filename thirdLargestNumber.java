import java.util.*;
public class thirdLargestNumber 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		System.out.println("Enter the size:="+n);
		
		int arr[] =new int[n];
		
		for(int i=0;i<n;i++)
		{
			 arr[i]=sc.nextInt();
			 System.out.println("the array:="+arr[i]+" ");
		}
		
		int max=arr[0];
	  Arrays.sort(arr);
	 
	   
	   for(int i=0;i<n;i++)
	   {
		   System.out.print("the array:="+arr[i]+" ");
	   }
	   
		
	}
}
