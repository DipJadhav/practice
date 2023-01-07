import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class sumEvenAfterQueries 
{
	public static void main(String args[])
	{
		int[] nums={1,2,3,4};
		int[][] queries={{1,0},
				         {-3,1},
				         {-4,0},
				         {2,3}};
		
		//ArrayList<Integer> l=new ArrayList<Integer>();
		//List<Integer> list =Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		
		for(int i=0;i<queries.length;i++)
		{
			int j=1;
		   if(j>-1)
			{
				int ind=queries[i][j];
				System.out.println("ind"+ind);
				j--;
				int var=queries[i][j];
				System.out.println("var"+var);
				
				nums[ind]=var;
			}
			  
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		
		
	}
}
