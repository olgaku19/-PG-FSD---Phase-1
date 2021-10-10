package assignment.modifier.p1;

public class M {
//M class  -->  private  int  default long protected float
	private int privateInt = 10;
	long defaultLong=20;
	protected float protectedFloat=3;
	
	protected void methodProtected() {
		System.out.println("Class M: methodProtected");
		
	}
	 void methodDefault() {
		System.out.println("Class M: methodDefault");
		
	}
	protected void methodPublic() {
		System.out.println("Class M: methodProtected");
		
	}
}
