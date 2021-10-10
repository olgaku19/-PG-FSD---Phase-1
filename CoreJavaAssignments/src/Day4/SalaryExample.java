package Day4;

import java.io.IOException;
import java.util.Scanner;




public class SalaryExample 
{
	
	
	 //Throw exception if number 1 is greater than 900
    static int compare(int s) throws IOException { // static method
    	if (s<2000)
    	{
    		throw new IOException("you need to work harder");
    	}
    		
    	else
    	{	
    		if (s > 2100 & s<5000)
    		{
    			throw new IOException("your salary is somehow good");
    			
    		}
      
    		else
    		{
    		
        			
    	 		     
    	    		 if (s >5100 & s<9000)
    	    		 {
    		    		 throw new IOException("your salary is very good");
    	    		 }
       			
    			throw new IOException("your salary is excellent");
         
    		}
    	}
		
	
   }
    
   public static void main(String args[]) throws IOException
   {       
	   int result=0;
	   Scanner scanner = new Scanner(System.in);  // taking user input from console
       
       System.out.println("Enter number 1 : ");
       int s = scanner.nextInt();
       
       
      
       try{
    	  result =compare(s);
       }
       catch(IOException ae)
       {
    	   System.out.println(ae.getMessage());
       }
       
       
   }

}
 