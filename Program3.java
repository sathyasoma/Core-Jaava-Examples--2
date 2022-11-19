import java.util.Scanner;

@FunctionalInterface
interface F
{
	boolean validate(String s1,String s2);
}
public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1=s.next();
		String s2=s.next();

F o=(n1,n2)->{if(n1.equals("mani") && n2.equals("9999")) return true;else return false;};
System.out.println(o.validate(s1,s2));
s.close();
}
}
