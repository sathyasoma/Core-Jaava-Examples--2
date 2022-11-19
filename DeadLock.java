class A {
public  synchronized void d1(B b)
{
   System.out.println("Thread 1 starts execution of d1() method");	

       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       System.out.println("Thread 1 trying to czll B's last() method");
       b.last();
}
public synchronized void last() {
	System.out.println("inside A,this is last() method");
}
}

class B{
	
	public  synchronized void d2(A a)
	{
	   System.out.println("Thread 2 starts execution of d2() method");	

	       try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	       System.out.println("Thread 2 trying to czll A's last() method");
	       a.last();
	}
	public synchronized void last() {
		System.out.println("inside B,this is last() method");
	}

}
public class DeadLock extends Thread {

	A a= new A();
	B b= new B();
	
	public void m1() {
		this.start();
		a.d1(b);  //this line is executed by Main Thread
	}
	
	public void run()
	{
		b.d2(a); //this line executed by child thread
		
	}
	
	public static void main(String[] args) {			
		DeadLock d= new DeadLock();
		d.m1();
	}
	
}
