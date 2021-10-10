package Day4;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExample
{
	
	
	 //Throw exception if number 1 is greater than 900
    static int compare(int num1, int num2) throws IOException { // static method
    	if (num1==num2)
    	{
    		return num1+num2;
    	}
    		
    		else {	
    		if (num1 > num2)
    		{
    			throw new IOException("num 1 is greater than num 2");
    		}
      
    		else
    		{
    			throw new IOException("num 2 is greater than num 1");
         
    		}
    	}
		
	
   }
    
   public static void main(String args[]) throws IOException
   {       
	   int result=0;
	   Scanner scanner = new Scanner(System.in);  // taking user input from console
       
       System.out.println("Enter number 1 : ");
       int num1 = scanner.nextInt();
       
       System.out.println("Enter number 2 : ");
       int num2 = scanner.nextInt();
      
       try{
    	  result =compare(num1,num2);
       }
       catch(ArithmeticException ae)
       {
    	   System.out.println(ae.getMessage());
       }
       
       System.out.println("Result is : "+result);
   }

}
