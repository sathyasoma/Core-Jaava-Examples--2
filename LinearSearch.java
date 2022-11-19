
public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {10,30,40,50,20};
		
		int search_el=60;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			
			 if(search_el==a[i])
			 {
				 System.out.println("elemnt is found:"+i);
				 flag=true;
				 break;
			 }
		}
		if(flag==false) {
		System.out.println("elemnt not found");
		}
	}
}
