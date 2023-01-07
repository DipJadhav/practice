package StaticKeyword;

public class staticVaribable 
{
	static int flag;
	static int count =0;
	 int nonstaticvariable=0;
	void add()
	{
		count++;
		System.out.println(count);
		
	}
	
	public  static void method()
	{
		//nonstaticvariable=8;  error Cannot make a static reference to the non-static field 
		//nonstaticvariable
		flag=3;
		count++;
		System.out.println("count"+count);
	}
    public static void main(String args[])
    {
    	staticVaribable obj =new staticVaribable();
    	staticVaribable obj1 =new staticVaribable();
    	obj.add();
    	obj.method();
    	//obj1.method();
    	
    	method();
    }
}
