package assignment.modifier.p1;

public class N {
	
	//N class  ---> protected long public int default double

	public int publicInt = 100;
	double defaultDouble=200;
	protected long protectedLong=300;
	
	public void methodPublic() {
		System.out.println("Class N: methodPublic");
		
	}
	 void methodDefault() {
		System.out.println("Class N: methodDefault");
		
	}
	protected void methodProtected() {
		System.out.println("Class N: methodProtected");
		
	}
}
