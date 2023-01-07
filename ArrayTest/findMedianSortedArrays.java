package ArrayTest;

public class findMedianSortedArrays 
{
	public static void main(String args[])
	{
		
		int nums1[]= {1,2};
		int nums2[]= {3,4};
		
		findMedianSortedArrays obj=new findMedianSortedArrays();
		obj.findMedian(nums1, nums2);
	}
	
	public double  findMedian(int[] nums1, int[] nums2)
	{
		int merged[]=new int[nums1.length+nums2.length];
		
		int i=0;
		int j=0;
		int k=0;
			while(i<nums1.length && j<nums2.length)
			{
				if(nums1[i]<nums2[j])
				{
					merged[k]=nums1[i];
					i++;
				}else
				{
					merged[k]=nums2[j];
					j++;	
				}				
				k++;
			}
			

			while(i<nums1.length)
			{
				merged[k]=nums1[i];
				i++;
				k++;
			
			}
			while(j<nums2.length)
			{
				merged[k]=nums2[j];
				j++;
				k++;
			
			}
			double n=0;
			int len=merged.length;
			if(len%2!=0)
			{
				n=(double)merged[(merged.length-1)/2];
			}
			else
			{
			  n=(double)(merged[(len-1)/2]+merged[(len)/2])/2;
			}
			
		System.out.println(n);
		return n;
	}
	
	
	
}
