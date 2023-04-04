package day13.Inheritance;
class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class diamonProb_MultilevelInheri extends A2,B2 {
	
	diamonProb_MultilevelInheri(){
		super();//confusion 
	}
	public static void main(String args[]) {
		diamonProb_MultilevelInheri obj = new diamonProb_MultilevelInheri();
		obj.msg();
	}
}

//public class  extends a,b {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
