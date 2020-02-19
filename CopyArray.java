
public class CopyArray {

	public static void main(String[] args) {
		 int a[]= {1,3,5} ;
		 int b[]= a.clone();	
		 
		 System.out.println("Array of a[]");
		 for (int i=0;i<a.length;i++)
		 {
			 		 System.out.print(a[i]+"  ");
	}
		 System.out.println();
		 System.out.println("Array of b[]");
		
		 for(int i=0;i<b.length;i++)
		 {
			
			 System.out.print(b[i]+"  ");
			 
		 }

	}

}
