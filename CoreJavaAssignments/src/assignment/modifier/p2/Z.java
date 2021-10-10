package assignment.modifier.p2;

import assignment.modifier.p1.M;
import assignment.modifier.p1.N;
public class Z extends M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Z class  --> call all the methods of the N, M, P class and call all the variables of the class X
		
		Z childZ = new Z();
		new N().methodPublic();
		new Z().methodPublic();
	    childZ.methodPublic();
	    childZ.methodProtected();
	    
		
		new X();
		System.out.println("Value of delaultLong  " + new X().defaultLong);
		System.out.println("Value of protectedFloat  " + new X().protectedFloat);
		System.out.println("Value of publicChar  " + new X().publicChar);

	}

}
