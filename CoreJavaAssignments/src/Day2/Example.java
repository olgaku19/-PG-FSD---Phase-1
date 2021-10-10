package Day2;

public class Example {

	
	public int addNumbers(int a, int b) {
		
		System.out.println("Add two numbers:" + (a+b));
		return b;
}
public float area(float r) {
	
System.out.println("area of the circule:" + 3.14*r*r);
return r;
}

public int areaRectangle(int c) {

	System.out.println("area of the rectangle:" + c*c);
	return c;
}

public static void main(String args[]) {
	
Example ob=new Example();
ob.addNumbers(2,4);
ob.area(3.f);
ob.areaRectangle(5);
}

}
