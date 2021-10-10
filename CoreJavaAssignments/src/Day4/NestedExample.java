package Day4;

public class NestedExample {


		
		
		public static void main(String[] args) {
	        try {
	        	
	        	int a[]=new int[5];
	        	a[5]=9;
                a[5]=30/0; 
                
                
	        	checkException1();  // calling method
	         
	        	
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index Exception");
	        } 
	        
	        finally {
	            System.out.println("outside main method");
	        }
	    }
	    
	    
	    public static void checkException1() { // called method
	        try {
	        	
	        	int[] a = null;
				a[5]=9;
				
	        }
	        finally {
	            System.out.println("inside method checkException1()");
	        }
	    }

	
	   
}
