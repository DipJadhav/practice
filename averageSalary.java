import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class averageSalary
{
	
	public static void main(String args[])
	{
		int[] salary={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
		
		
		/*List<Integer> l=new ArrayList<Integer>();
		l = Arrays.stream(salary).boxed().collect(Collectors.toList());
		int min= l.stream().min(Integer::compare).get();
        int max=l.stream().max(Integer::compare).get();
        int size = (int) l.stream().filter(i1->i1!=min&& i1!=max).count();
        
        double sum=(l.stream().filter(i1->i1!=min&& i1!=max).collect(Collectors.summingDouble(Integer::intValue)));
		
        double avg=sum/size;
		
		System.out.println("min="+min+"  max="+max);
		System.out.println("sum="+sum);
		System.out.println("size="+size);
		System.out.println("avg="+avg);*/
		List<Integer> l=new ArrayList<Integer>();
		l = Arrays.stream(salary).boxed().collect(Collectors.toList());
		int min= l.stream().min(Integer::compare).get();
        int max=l.stream().max(Integer::compare).get();
        int size = (int) l.stream().filter(i1->i1!=min&& i1!=max).count();
        
        double sum=(l.stream().filter(i1->i1!=min&& i1!=max).collect(Collectors.summingDouble(Integer::intValue)));
		
		
	}

}
