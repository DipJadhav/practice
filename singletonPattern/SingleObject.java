package singletonPattern;

/*public class MultipleObject 
{
	
	public static void main(String args[])
	{
		
		
		//here we have created two objects
		SingleObject obj1=new SingleObject();
		SingleObject obj=new SingleObject();
		System.out.println(obj.toString()); 
		System.out.println(obj1.toString());
		
		//output 
		//SingleObject@15db9742
		//SingleObject@6d06d69c
		
		

	}
}
*/
public class SingleObject 
{
	 static SingleObject obj1=new SingleObject();
	 static SingleObject obj2=new SingleObject();
	 private  SingleObject()
	{
		 System.out.println("Private Constructor is called");
	}
	
	public static SingleObject getInstance()
	{
		return obj1;
	}
	
	public static void main(String args[])
	{
		//here we have created two objects
		
		SingleObject obj3=new SingleObject();
		System.out.println(obj1.toString()); 
		System.out.println(obj1.getInstance()); 
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
	}
	public void showMessage(){
        System.out.println("Hello World!");
     }
}