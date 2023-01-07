import java.util.ArrayList;
import java.util.stream.Collectors;


public class StreamQue 
{
	
	public static void main(String atgd[])
	{
		ArrayList<Integer> list =new ArrayList<Integer>();
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		System.out.print("Dipasju");
		list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    
	    Integer n= list.stream().mapToInt(Integer::intValue).sum();
	    System.out.print("Sum of elements="+n);
	    
	    
	   list.stream().map(i->i*i).filter(i->i<100).mapToInt((i1,i2)->(i.sum(i1, i2))/i.SIZE);
	   System.out.print("lsit1 of elements="+list1);
	   
	}
	

}
