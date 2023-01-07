package override;

public class Amaze extends Car
{
	void start()
	{
		System.out.println("start from  Amaze");
	}
	public static void main(String args[])
	{
		Amaze obj =new Amaze();
		obj.start();
		
		Car obj1 =new Amaze();
		obj1.start();
		
		Car obj2 =new Car();
		obj2.start();
	// Error will occured in below case Exception in thread "main" java.lang.Error: Unresolved compilation problem: Type mismatch: cannot convert from Car to Amaze	
	//Amaze obj3 = new Car();
		
	//	obj3.start();
		
	}
}
