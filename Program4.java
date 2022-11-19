interface Functionable
{
	void func();
}
interface Functionable1
{
	String func();
}
class MethodReferenceDemo {
	static int id;
	String name;
	@SuppressWarnings("static-access")
	public MethodReferenceDemo() {
         this.id=1;
         this.name="Manikanth";
	}
	public static void getId() {
		System.out.println(id);
	}
		public String getName() {
		return name;
	}
}
public class Program4{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MethodReferenceDemo s=new MethodReferenceDemo();
		//constructor calling
		Functionable f=Program4::new;
		//instance method calling using reference
		Functionable1 f1=s::getName;
		System.out.println(f1.func());
		//static method calling
		Functionable f2=MethodReferenceDemo::getId;
		f2.func();
	}
}
