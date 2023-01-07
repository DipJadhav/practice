import java.io.*;
import java.util.*;

public class scanner1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner sc =new Scanner(System.in);
  
    
      List<String> events = new ArrayList<>();
      
      String l=sc.nextLine();
     
      String arr[]=sc.nextLine().split("\\s");
      for(int i=0;i<arr.length;i++)
      {
           events.add(arr[i]);
      }
     
    
     
     

     
    int no=Integer.parseInt(sc.nextLine());
       while(sc.hasNextLine())
       {
           if(sc.nextLine().equals("Insert"))
                    {
                    String arr1[] =sc.nextLine().split("\\s");
                    //System.out.print("arr1[1]"+arr1[1]); 
                    events.add(Integer.parseInt(arr1[0]),arr1[1]);

                    } 
                    if(sc.nextLine().equals("Delete"))
                    {
                        int deint=Integer.parseInt(sc.next());
                        events.remove(deint);
                    }
       }   
 
         for(int i =0 ;i<events.size();i++)
         {
              System.out.print(events.get(i)+" ");
         }  
        
        
    }
}
