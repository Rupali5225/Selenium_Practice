package day11.thisKeyword;

public class IMPthisEg {
	int rollno;
	float fee;
	IMPthisEg(int rollno, float fee) {		
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
		//global variable = local variable	
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("Local varibale: "+rollno);
		System.out.println("Local varibale: "+fee);
		System.out.println("Global varibale: "+this.rollno);
		System.out.println("Global varibale: "+this.fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);	
	}
}
class ThisKeyword01 {
	public static void main(String args[]) {
		
		IMPthisEg s1 = new IMPthisEg(111, 5000f);
		s1.display();//
		System.out.println("********************************");
		IMPthisEg s2 = new IMPthisEg(112, 6000f);
		s2.display();//
	}
}