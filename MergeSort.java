
public class MergeSort 
{
	
	
	static void sort(int arr[])
	{
		if(arr.length==0)
			return;
		
	if(arr.length>1)
	{		
		int mid = arr.length/2;
		int left[]=new int[mid];
		
		for(int i=0;i<mid;i++)
		{
			left[i]=arr[i];
		}
		
		int right[]=new int[arr.length-mid];
		
		for(int i=mid;i<arr.length;i++)
		{
			right[i-mid]=arr[i];
		}
		
		sort(left);
		sort(right);
		
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		
		while(j<right.length)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}	
	}
	/*static void sort(int arr[] )
	{
		
		if(arr == null)
        {
            return;
        }
		
		if(arr.length>1)
		{
				int mid=arr.length/2;
				int leftArr[]=new int[mid];
				
				for(int i=0;i<mid;i++)
				{
					leftArr[i]=arr[i];
				}
				
				int rightArr[] =new int[arr.length-mid];
				for(int i=mid;i<arr.length;i++)
				{
					rightArr[i - mid]=arr[i];
				}
			
				 sort(leftArr);
				 sort(rightArr);
				 int i = 0;
		         int j = 0;
		         int k = 0;
	         
		         while(i<leftArr.length && j<rightArr.length)
		         {
		        	 if(leftArr[i]<rightArr[j])
		        	 {
		        		 arr[k]=leftArr[i];
		        		 i++;
		        	 }
		        	 else
		        	 {
		        		 arr[k]=rightArr[j];
		        		 j++;
		        	 }
		        	 k++;
		         }
		         
		         while(i < leftArr.length)
		         {
		        	 arr[k]=leftArr[i];
		        	 i++;
		        	 k++;
		         }
		         
		         while(j<rightArr.length)
		         {
		        	 arr[k]=rightArr[j];
		        	 j++;
		        	 k++;
		         }
	         
		}
		
		
	}*/
	public static void main(String args[])
	 {
		

		
		 int arr[]={56,67,78,34,3,1};
		 sort(arr);
		 System.out.println("after call");
		 

	        for(int i=0; i<arr.length; i++){
	            System.out.print(arr[i]+" ");
	    }
		 
	 }
}
