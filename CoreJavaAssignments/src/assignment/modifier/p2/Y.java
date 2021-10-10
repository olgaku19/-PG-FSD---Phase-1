package assignment.modifier.p2;

import assignment.modifier.p1.N;

public class Y extends N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Y class ---> call all the methods of the N, M class and call all the variables of the class X
		Y childY=new Y();
	    new N().methodPublic();
	    childY.methodProtected();
	    
		new X();
		System.out.println("Value of delaultLong  " + new X().defaultLong);
		System.out.println("Value of protectedFloat  " + new X().protectedFloat);
		System.out.println("Value of publicChar  " + new X().publicChar);
		
	
	}

}
