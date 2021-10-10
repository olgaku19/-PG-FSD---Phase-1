package Day2;

public class strExample {

		public static void main(String[] args)
			 {
				// TODO Auto-generated method stub
				String t= "Delhi";  
				String o = "Mumbai";
				String k= "delhi";  
				String y= new String ("Mumbai");   
				String l= new String ("delhi");  
				String p = new String("Hello"); 
				//equal
				//(1) o with l
				//(2) y with p
				//(3) t with o
				//(4) k with y
				//(5) p with y
				
				if(o.equals(l))
				{
					System.out.println("true..  o equal to l");
				}
				else
				{
					System.out.println("false..  o not equal to l");
				}
				
				if(y.equals(p))
				{
					System.out.println("true..  y equal to p");
				}
				
				else
				{
					System.out.println("false..  y not equal to p");
				}
				if(t.equals(o))
				{
					System.out.println("true..  t equal to o");
				}
				else
				{
					System.out.println("false..  t not equal to o");
				}
				if(k.equals(y))
				{
					System.out.println("true..  k equal to y");
				}
				else
				{
					System.out.println("false..  k not equal to y");
				}
				if(p.equals(y))
				{
					System.out.println("true..  p equal to y");
				}
				else
				{
					System.out.println("false..  p not equal to y");
				}
				
			}

		


	}



