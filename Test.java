
public class Test {

	static String schoolName = "dps"; // static variable
	int number = 567; // instance variable

	public void dispaly() { // instance method
		System.out.println("i am dispaly method");
		int age = 45;
	}

	public int sumOfTWoNumbers(int a, int b) { // instance method
		return a + b;
	}

	public static void subOfTwoNumbers(float a, float b) { // static method
		System.out.println(a - b);
	}

	public static void main(String[] args) { // main method

		int pincode = 6789; // local variable
		System.out.println(pincode);
		// calling static prpoperties

		System.out.println(Test.schoolName);
		System.out.println(schoolName);

		Test.subOfTwoNumbers(78.0f, 45.0f); // static method calling

		// object creation

		Test obj = new Test(); // object creation

		System.out.println(obj.number);

		obj.dispaly();

		System.out.println(obj.sumOfTWoNumbers(74, 36));

	}

}
