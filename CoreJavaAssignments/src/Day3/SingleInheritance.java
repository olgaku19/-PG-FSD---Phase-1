package Day3;

class City{
	
	private String street="Longfellow";
	private int apt=20;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getApt() {
		return apt;
	}
	public void setApt(int apt) {
		this.apt = apt;
	}
	
	
}


public class SingleInheritance extends City{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj= new SingleInheritance();
		
		System.out.println(obj.getStreet());
		System.out.println(obj.getApt());

	}

}
