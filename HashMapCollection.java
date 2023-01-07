import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapCollection
{  
	
	public static void main(String arg[])
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		map.put(1,"Mango");  //Put elements in Map  
		map.put(2,"Apple");   
			
	//iterate hashmap	
		System.out.println(map.get(1));
		
		for(Entry m: map.entrySet())
		{
			System.out.println("=1=="+m.getKey()+ m.getValue());
		}
		
		
		for(int i=1;i<=map.size();i++)
		{
			System.out.println("=2=="+map.get(i));
		}
		
		
		///////////////
		HashMap<String,String> gfg = new HashMap<String,String>();
	      
        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
          
        // looping over keys
        for (String name : gfg.keySet()) 
        {
            // search  for value
            String url = gfg.get(name);
            System.out.println("Key = " + name + ", Value = " + url);
        }
	
	}
	
	
	
   
}
