
public class StringPrint {
	
	public static void main(String args[])
	{
		String s=30+40+"dipashri"+30+40;
		String s1=30+40+"dipashri"+30+40;
		System.out.println(s);
		System.out.println(30+40+"dipashri"+30+40);
		
		System.out.println("dip"+30+40);
		System.out.println("diashri"+s1==s);
		System.out.println("diashri"+s1.equals(s));
	}

}
