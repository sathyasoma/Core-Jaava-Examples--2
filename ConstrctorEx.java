
//constructor chaining
public class ConstrctorEx {
 	
   public ConstrctorEx() { //deafault constructor
	   
	   this("jash"); //calling current class param conctor
	   
	   System.out.println("this is deaflut construr");
	   System.out.println(this);
	   
   }	

   public ConstrctorEx(int x,String y) { //param constructor
	   
	   System.out.println(this);
	   
   }
  public ConstrctorEx(String name) {
	  this(45,"fg");
	  System.out.println("i am param construot called by defalut constructor");
  }

  public static void main(String[] args) {
	
	  ConstrctorEx cx= new ConstrctorEx();

	  
}

}
