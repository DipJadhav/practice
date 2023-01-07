package ArrayTest;

public class Peakelement
{
	public static void main(String args[])
	{
	int arr[]= {2,3,4};
	int n=arr.length;
	
	Peakelement obj=new Peakelement();
	int output=obj.peakElement(arr, n);
	System.out.println("out"+output);
	}
	
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int  temp=0;
       for(int i=0;i<n-1;i++)
       {
         
           if(arr[i]<arr[i+1])
           {
              temp=1;
              // System.out.println("temp"+temp);
               return temp;
           }
          
        }
       return temp;
       
      
    }
}
