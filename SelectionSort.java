
public class SelectionSort 
{
	 public static void main(String args[])
	   {int m=0; int n=0;
		 int arr[]={12,45,23,51,19,8,8};
		 for(int i=0;i<arr.length-1;i++)
		 { int temp=0;
		 System.out.println( "n====="+n++);          
			 for(int j=i+1;j<arr.length;j++)
			 {  
				 System.out.println( "m====="+m++); 
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
				 
			 }
			 
		 }
		 
		  for(int i =0;i<arr.length;i++)
		   {
			  System.out.print( arr[i]+" ");
		   }
		 
	   }
}
