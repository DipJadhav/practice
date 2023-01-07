import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
  public static void main(String[] args) throws ParseException 
  {
    System.out.println("Hello World!");
     String dateInString = "30/08/2021 08:11:11";
     System.out.println("date "+dateInString);
	SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	Date date = formatter2.parse(dateInString); 
	System.out.println("date: "+date);
  }
}
