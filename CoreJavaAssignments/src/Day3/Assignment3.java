package Day3;


/*Assignment 3:
1) Create an abstract class pen with methods write () and refill () as abstract methods 
2) Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
3) Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements basic animal interface with eat ( ) and sleep methods 
4) Demonstrate polymorphism using using monkey  class from Q3 
*/

abstract class pen{
	
	abstract void write();
	abstract void refill();
	
}

class fountainPen extends pen{
	
	
	void write(){
		
	System.out.println( "Write something with the pen");
	}
	void refill(){
		
	 System.out.println("Refill the pen");	
	}
	
	void Nib() {
		
		System.out.println( "This is an example of using a pen");
	}
}

 class monkey{
	
	 
	 void jump() {
			
			System.out.println( "Jumping is a good exercise");
		}
		
		void bite() {
			
			System.out.println( "Proper bite can save your teeth");
		}
		
	
}

class human extends monkey{
	
	void eat() {
		
		System.out.println( "Humans like fruits");
	}
	
	void sleep() {
		
		System.out.println( "Lets take a nap");
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pen obj1;
		
		human obj2=new human();
		
		obj1= new fountainPen();
		
		((fountainPen) obj1).Nib();
		obj1.write();
		obj1.refill();
	   
		obj2.bite();
		obj2.jump();
		obj2.eat();
		obj2.sleep();
		
		
		
		

	}

}





