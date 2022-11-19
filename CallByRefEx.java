
public class CallByRefEx {

	int value=78;
	
	
	void change(CallByRefEx cr) {
		
		cr.value=cr.value+100;//
	}
	public static void main(String[] args) {
		
		
		CallByRefEx cr= new CallByRefEx();
		
		System.out.println(cr.value);//78
		
		cr.change(cr);
		System.out.println(cr.value); //78
		
	}
}
