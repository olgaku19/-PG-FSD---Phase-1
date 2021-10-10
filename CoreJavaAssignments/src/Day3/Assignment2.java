package Day3;

/*    Assignment 2:

(Parent) MNC ---> 2 abstract methods + 1 constructor + 1 normal method

Infosys (child of MNC) ----> make it abstract also  but give the implementation of single abstarct method

Hello (child of Infosys) ----> here implement all the abstarct methods + 1 create noraml method also

main class ---> call all the methods of all classes using the dynamic polymorphism
*/


abstract class MNC {
	
	MNC(){
		
		System.out.println("Welcome to our company");
	}
	
	abstract void Job();
	abstract void Salary();
	
	void Advertisemet() {
		
		System.out.println("We are hiring");
		
	}
	
}

abstract class Infosys extends MNC{
	
	void Job(){
		
		System.out.println("Manager");
		
	}
	
	abstract void Salary();

	abstract void Product();

	
}

class Hello extends Infosys{
	
	
	void Salary(){
		
		System.out.println("We offer competetive salary started from $60K");
		
	}
	
	 void Product() {
		
		
		System.out.println("The applicant should be familiar with our product");
		
		
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Infosys obj;
		
		obj= new Hello();
		
		obj.Advertisemet();
		obj.Job();
		obj.Salary();
	    obj.Product();
		
		

	}

}
