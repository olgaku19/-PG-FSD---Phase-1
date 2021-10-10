package Day3;

/*Assignment 1:

Vechile:(Parent)
- create two abstract methods  - run() and stop()
- create three methods of public void fuel - 1st method will take int / 2nd method will float and string  / 3rd method will take char and int (method overloading)
- declare two variables - int speed and long distance
- create two constructors also- default and parametrized

2W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 2
- create methods here also as display() --> this will print the three variables of 2W  + all the variable of the parent Vechile  (hint: super.variable_name)

3W:
- oveeride the two methods - run() and stop()
- - create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 3
- create methods here also as display() --> this will print the three variables of 3W  + all the variable of the parent Vechile

4W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 4
- create methods here also as display() --> this will print the three variables of 4W  + all the variable of the parent Vechile

8W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 8
- create  methods here also as display() --> this will print the three variables of 8W  + all the variable of the parent Vechile

  Main()
  - call all the methods using dynamic/runtime polymorphism here
  - all the methods of all the child classes.
  - call all the methods of the fuel of Vechile class
  */

abstract class Vehicle{
	
	int speed=100;
	long distance= 5000;
	
	Vehicle(){
		
		System.out.println("Vehicle is created");
	}
	
    Vehicle(String str){
    	
		System.out.println(str + distance/speed);
	}
	
	abstract void run();
	abstract void stop();
	abstract void display();
	
	public void fuel(int i) {  
		
		System.out.println("energy value" + i);
		
	}
	public void fuel(float r, String p ) {
		
		System.out.println(p+"   "+r);
		
	}
	public void fuel(char t, int l) {
		
		System.out.println(t+"   "+l);
		
	}
}
 
class W2 extends Vehicle{
	
	public long distance = 1000;
	public int speed = 80;
	int nos_of_tire = 2;
	
	W2(){
		
		
		super("parameterized constructor of class Vehicle: time of travel:  ");
		System.out.println("Child class W2");
		super.fuel(18800);
		super.fuel(0.34f,"burning rate    ");
		super.fuel(90, "O");
		
	}
	

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child class W2 run method");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Child class W2 stop method");
	}
	
	public void display() {
		
		System.out.println("distance  =  "+ distance);
		System.out.println("speed  =  "+ speed);
		System.out.println("nos_of_tire  =  "+ nos_of_tire);
		System.out.println("Variables of the parent class");
		System.out.println("distance  =  "+ super.distance);
		System.out.println("speed  =  "+ super.speed);

	
}
}
class W3 extends Vehicle{
	
	public long distance = 3000;
	public int speed = 50;
	int nos_of_tire = 3;
	
	W3(){
		
		
		System.out.println("Child class W3");
		super.fuel(9750);
		super.fuel(0.43f,"burning rate    ");
		super.fuel(103, "O");
		
	}
	

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child class W3 run method");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Child class W3 stop method");
	}
	
	public void display() {
		
		System.out.println("distance  =  "+ distance);
		System.out.println("speed  =  "+ speed);
		System.out.println("nos_of_tire  =  "+ nos_of_tire);
		System.out.println("Variables of the parent class");
		System.out.println("distance  =  "+ super.distance);
		System.out.println("speed  =  "+ super.speed);

	
}
	
}
class W4 extends Vehicle{
	
	public long distance = 6000;
	public int speed = 95;
	int nos_of_tire = 4;
	
	W4(){
		
		
		System.out.println("Child class W4");
		super.fuel(12800);
		super.fuel(0.34f,"burning rate    ");
		super.fuel(102, "O");
		
	}
	

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child class W4 run method");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Child class W4 stop method");
	}
	
	public void display() {
		
		System.out.println("distance  =  "+ distance);
		System.out.println("speed  =  "+ speed);
		System.out.println("nos_of_tire  =  "+ nos_of_tire);
		System.out.println("Variables of the parent class");
		System.out.println("distance  =  "+ super.distance);
		System.out.println("speed  =  "+ super.speed);

	
}
	
}
class W8 extends Vehicle{
	public long distance = 7000;
	public int speed = 70;
	int nos_of_tire = 8;
	
	W8(){
		
	
		System.out.println("Child class W8");
		super.fuel(17177);
		super.fuel(0.36f,"burning rate    ");
		super.fuel(96, "O");
		
	}
	

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child class W8 run method");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Child class W8 stop method");
	}
	
	public void display() {
		
		System.out.println("distance  =  "+ distance);
		System.out.println("speed  =  "+ speed);
		System.out.println("nos_of_tire  =  "+ nos_of_tire);
		System.out.println("Variables of the parent class");
		System.out.println("distance  =  "+ super.distance);
		System.out.println("speed  =  "+ super.speed);

	
}
	
}

public  class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj;
		
		obj= new W2();
		
		obj.run();
		obj.stop();
		obj.display();
		
		obj= new W3();
		
		obj.run();
		obj.stop();
		obj.display();
		
		obj= new W4();
		
		obj.run();
		obj.stop();
		obj.display();
		
		obj= new W8();
		
		obj.run();
		obj.stop();
		obj.display();
		
		

	}

}


