package Day2;

public class Array2D {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[][] a= {{15,25,35},{45,55,65}};
			int[][] b= {{12,22,32},{55,25,85}};
			int[][] c= new int[3][3];
			
			/* Summing elements of arrays a and b and pot it into c */
					
					for (int i=0; i<2;i++) {
						
						for (int j=0;j<2; j++ ) {
							c[i][j]=a[i][j]+b[i][j];
							System.out.println(c[i][j]);
							
						}
						
					}
				}

			

		}



