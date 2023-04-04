package day23.Pyramids_pr;

public class eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 6;
		int i,j;
//		for(int i =0;i<row;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
//		
		
		//new 
//		
//		for(i=1;i<6;i++) {
//			for(j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		//print char
//		
//		char c;
//		for(c='a';c<='e';c++) {
//			for(j='a';j<=c;j++) {
//				System.out.print(c+"");
//			}
//			System.out.println();
//		}
		
		
		//new
//		for(i=6;i>0;i--) {
//			for(j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//new IMPPP
//		int k;
//		for(k=5;k>0;k--) {
//			System.out.print(" _");
//			for(i=0;i<=6;i++) {
//				for(j=0;j<i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		
		
		for ( i = row; i > 0; i--) {// number of lines
			for ( j = 1; j <= i; j++) {// define design
				System.out.print(" ");
			}
			for ( j = i; j <= row; j++) {// define patterns
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
