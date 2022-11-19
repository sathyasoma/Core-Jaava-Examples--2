import java.util.Scanner;

@FunctionalInterface
interface D
{
	int facto(int n1);
}
public class Program5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
D s3=(n1)->{int p=1;for(int i=1;i<=n1;i++) {p=p*i;}return p;};
System.out.println("FACTORIAL IS "+s3.facto(n));
s.close();
}
}
