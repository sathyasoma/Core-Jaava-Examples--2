import java.util.Scanner;

@FunctionalInterface
interface E
{
	int power(int n1,int n2);
}
public class Program1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n,m(n power m)");
		int n=s.nextInt();
		int m=s.nextInt();

E s3=(n1,n2)->{return (int) Math.pow(n1,n2);};
System.out.println("X power y IS "+s3.power(n,m));
s.close();
}
}
