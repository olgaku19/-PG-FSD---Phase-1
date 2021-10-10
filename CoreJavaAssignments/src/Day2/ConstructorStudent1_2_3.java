package Day2;

public class ConstructorStudent1_2_3 {

/*  */
	
	
		String name;
		int age;
		char section;
		char gender;
		int subject1;
		int subject2;
		int subject3;
		int mark=1;
		
		ConstructorStudent1_2_3(int a, String n,int subject1,int subject2,int subject3){
					
			mark=subject1+subject2+subject3;
			name=n;
			age=a;
			
		}
		ConstructorStudent1_2_3(int a, String n,boolean p,int subject2, int subject3){
					
			mark=subject2+subject3;
			name=n;
			age=a;
			
		}
		
		
		void display() {
			
			System.out.println(age+" "+name+" "+mark );
		}
		
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			ConstructorStudent1_2_3 s1 = new ConstructorStudent1_2_3(20, "S1",4,5,6);
			ConstructorStudent1_2_3 s2 =new ConstructorStudent1_2_3(21,"S2",2,3,4);
			ConstructorStudent1_2_3 s3= new ConstructorStudent1_2_3(22,"S3",0, 4, 5);
			ConstructorStudent1_2_3 s4=new ConstructorStudent1_2_3(23,"S4",0, 3,6);
			s1.display();
			s2.display();
			s3.display();
			s4.display();
			
		}

		

	


}
