

class Demo extends Exception{
	
	private int age;
	
	public Demo(int age) {
		this.age=age;
	}
	
//	public String toString() {
//		return "age not valid exception";
//	}
	
}
public class Test4 {
	
	static void validation(int age) throws Demo {
		if (age<18)
		throw new Demo(age);
		else
			System.out.println("you");
	}
public static void main(String[] args) throws Demo {
	
	Test4.validation(12);
	
}
}
