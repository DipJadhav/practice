package singletonPattern;



public class SingletonPatternDemo 
{
   
	public static void main(String args[])
	{
		
		
		SingleObject obj=SingleObject.getInstance();
		SingleObject obj1=SingleObject.getInstance();
		System.out.println(obj.toString()); 
		System.out.println(obj1.toString()); 
		
	}
}
