

package Day2;



public class MethodPlusConstructors {
	
	float x;
	float y; 
	float radius;
	String name;
	float area;
	double degrees;
	
	public MethodPlusConstructors() {
		
		System.out.println("   /*i want to calculate the area of the different shapes\r\n" + 
				"*  - square, rectangle, circle 1. create 4 constructors - default + three constrctors for the shapes (using constructor overloading)\r\n" + 
				"*   2. create 3 methods for (square, rectangle, circle) display which will display the value of the area calculated\r\n" + 
				"\r\n" + 
				"3. calcuate the area of the rhombus and triangle using the method overaloding concept \r\n" + 
				"*/\r\n" + 
				" ");
		
		
	}
	/*     square and rhombus  */
	public MethodPlusConstructors(float a, boolean i) {
		
		x=a;
		
		if (i==true) {
			
			name="square";
			
		}
		
		else {
			
		
			name="rhombus";
			
		}
	}
	
	/*  rectangle and triangle */
	public MethodPlusConstructors(float b, float c, boolean j) {
		
		x=b;
		y=c;
		if (j==true) {
		name="rectangle";
	
		}
		
		else {
			
			name="triangle";
			
		}
	}
	
	/*    circle   */
	public MethodPlusConstructors(float r,String iCircle) {
		
		radius=r;
		name="circle";
}
	
	public float areaRectangle() {
		
		area=x*y;
		return area;
		
	}
	
	public float areaCircle() {
			
			area=3.14f*radius*radius;
			return area;
			
		}
	public float areaSquare() {
		
		area=x*x;
		return area;
		
	}
	
	public float getArea(double d,String m) {
		
		String r=m;
		degrees=d;
		double radiants=Math.toRadians(degrees);
		area=(float) (Math.sin(radiants)*x*x);
		return area;
		
	}
	

	public float getArea(double d) {
		
		degrees=d;
		double radiants=Math.toRadians(degrees);
		area=(float) (Math.sin(radiants)*((x*y)/2));
		return area;
		
	}

	
	  
	public void display() {
		  System.out.println(name + "    " + area);
		  
	  }


	public static void main(String args[]) {
		
	new MethodPlusConstructors();
	
		
	MethodPlusConstructors rectangle =new MethodPlusConstructors(5.f,10.f,true);
	rectangle.areaRectangle();
	rectangle.display();
	
	MethodPlusConstructors circle =new MethodPlusConstructors(20.f,"Circle");
	circle.areaCircle();
	circle.display();
	
	MethodPlusConstructors square =new MethodPlusConstructors(30.f, true);
	square.areaSquare();
	square.display();
	
	MethodPlusConstructors rhombus =new MethodPlusConstructors(20.f, false);
	rhombus.getArea(45,"rhombus");
	rhombus.display();
	
	MethodPlusConstructors triangle =new MethodPlusConstructors(150.f,231.f,false);
	triangle.getArea(123);
	triangle.display();
	
	
	
	}
}
	
	

/*i want to calculate the area of the different shapes
*  - square, rectangle, circle 1. create 4 constructors - default + three constructors for the shapes (using constructor overloading)
*   2. create 3 methods for (square, rectangle, circle) display which will display the value of the area calculated

3. calculate the area of the rhombus and triangle using the method overloading concept 
*/



