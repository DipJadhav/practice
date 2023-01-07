import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class firstMissing 
{
	public static void main(String args[])
	{
		int[] nums={0,1,2,3,4,5,6};
		
		firstMissing obj=new firstMissing();
		
		int n=obj.firstMissingPositive(nums);
		
		System.out.println("n==="+n);
	}
	
	 public int firstMissingPositive(int[] nums) 
	 {
		
			    int i=0;
				int j=0;
				int count=nums.length;
				int temp=0;
				while(count>-1 && i<nums.length && j<nums.length)
				{ 
				   if(nums[i]>nums[j])
				   {
					   temp=nums[j];
					   nums[j]=nums[i];
					   nums[i]=temp;
				   }
					j++;count--;
					 if(count==0)
					  {
					    count=nums.length;i++;j=0;
					  }	
				}	

			
				
		
			
				
				System.out.println(l);
				int tempmin=1;
				
				boolean flag=false;
				while(!flag)
				{		
					System.out.println("inside="+l.contains(tempmin));
				if(l.contains(tempmin))
				{
					System.out.println("Prsent="+tempmin);
					tempmin++;
				}
				else
				{
					flag=true;
				}
				
				
				}
				
				
				
			
			
				
				/*	int tempmin=1;
				int m=0;
				while(m<nums.length)
				{
					if(nums[m]==tempmin)
					{
						//System.out.print(nums[m]+" m="+m +"tempmin="+tempmin);
						tempmin++;
						m=0;
					}
					else
					{
						m++;
					}

				}*/
		 return tempmin;
	        
	 }
}
