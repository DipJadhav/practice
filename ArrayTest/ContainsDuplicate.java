package ArrayTest;

import java.util.ArrayList;


public class ContainsDuplicate {

	
	public boolean containduplicatInteger(int[] nums)
	{
		ArrayList<Integer>num=new ArrayList<Integer>();
		
		boolean flag=false;
	
		for(int i=0;i<nums.length;i++)
		{	
				if(num.contains(nums[i]))
				{
					
					System.out.println("nums=="+nums[i]);
					flag=true;
				}
				else
				{
					num.add(nums[i]);
					flag=false;
				}
				
		}
		return flag;
		
	}
	
	public static void main(String args[])
	{
		int[] nums={2,2,3,1};
		
		ContainsDuplicate obj=new ContainsDuplicate();
		boolean flag=obj.containduplicatInteger(nums);
		System.out.println(flag);
		
	}
	
	
}
