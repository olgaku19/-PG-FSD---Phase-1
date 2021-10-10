package Day4;

public class ExeptionExample
{
	 
	
	public static void main(String[] args)
	{  
        
			try{ 
				
				int a[]=new int[5];  
             
                     
             checkException1(a); 
             checkException2(a);
             
             
			}  
			finally 
	        {
	            System.out.println("Finally inside main method ");
	        } 
			
			
	}		
			
	
			public static void checkException1(int[] a)
			{ // called method
		        try {
		            
					a[5]=9;
		        } 
		        
		        catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("ArrayIndexException");
		            }
		        
		        finally {
		            System.out.println("Finally inside method 1");
		        }
		    }
		    
			public static void checkException2(int[] a)
			{ // called method
		        try {
		        	
				
					a[5]=30/0;
		        }
		        catch (ArithmeticException e)
		        {
		            System.out.println("ArithmeticException");
	            } 
		        
		        finally 
		        {
		            System.out.println("Finally inside method 2");
		        } 
		        
		    }
	}
              
       

