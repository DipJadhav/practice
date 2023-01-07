
public class BubbleSort 
{
	 public static void main(String args[])
	 {
		 int arr[]={12,45,23,51,19,8};
		 int n=arr.length;
		 int count=1;
		 while(count<n)
		 {
			 for(int i=0;i<n-count;i++)
			 {
				 
				 if(arr[i]>arr[i+1])
				 {
					 int temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
					 
				 }
			 }
			 count++;
		 }
		 

		  for(int i =0;i<arr.length;i++)
		   {
			  System.out.print( arr[i]+" ");
		   }
		 
	 }
}
