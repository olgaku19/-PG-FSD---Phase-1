package assignment.modifier.p1;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//P class  --> call and print the variables of class M and N
		new M();
		new N();
		System.out.println("Value of delaultLong  " + new M().defaultLong);
		System.out.println("Value of protectedFloat  " + new M().protectedFloat);
		System.out.println("Value of publicInt  " + new N().publicInt);
		System.out.println("Value of defaultDouble  " + new N().defaultDouble);
		System.out.println("Value of protectedLong  " + new N().protectedLong);
	}
		
	public void methodPublic() {
			System.out.println("Class P: methodPublic");
			
		}
		 void methodDefault() {
			System.out.println("Class P: methodDefault");
			
		}
		protected void methodProtected() {
			System.out.println("Class P: methodProtected");
			
		}

	

}
