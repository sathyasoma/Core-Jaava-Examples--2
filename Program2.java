import java.util.Scanner;
interface Space
{
	void words_space(String a);
}

public class Program2 {
	public static void main(String[] args) {
		Space s=(a)->{
		for(int i=0;i<a.length();i++)
		{
			System.out.print(a.charAt(i)+" ");
		}
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String a=sc.next();
		s.words_space(a);
		sc.close();
	}
}
