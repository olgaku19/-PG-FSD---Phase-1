package Day3;


/*   Assignment 4:
Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods 
create another class smart telephone and demonstrate polymorphism       */

abstract class Telephone{
	
	abstract void lift();
	abstract void disconnect();
	
}

class SmartPhone extends Telephone{

	@Override
	void lift() {
		// TODO Auto-generated method stub
	System.out.println("Please answer the phone");
		
	}

	@Override
	void disconnect() {
		// TODO Auto-generated method stub
		
		System.out.println("Your phone call is canceled");
		
	}
	
	
	
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telephone phone=new SmartPhone();
		phone.lift();
		phone.disconnect();
		
	}

}
