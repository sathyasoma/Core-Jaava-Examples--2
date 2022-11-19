
public class WrapperClass {

	
	public static void main(String[] args)
	{
	   Integer obj1=new Integer(123);
	   Integer obj2=new Integer("124");
	   
	System.out.println("After boxing");
	
	System.out.println("obj1="+obj1);
	System.out.println("obj2="+obj2);
	
	System.out.println("After unboxing");
	int a=obj2;
	System.out.println("a="+a);
	int b=obj1;
	System.out.println("b="+b);
	}
	
}
