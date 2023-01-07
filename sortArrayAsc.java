import java.util.*;
public class sortArrayAsc
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
		int temp =0;
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
			
		}
		
		 for(int i=0;i<n;i++)
		   {
			   System.out.print("the array:="+arr[i]+" ");
		   }
		   
		
	}
}
