package day16.Typecasting;
//No need to create object time just inherit and refere the child obj/parent obj i.e typecasting
//it saves memory

class Parent100 {
	void myHome() {
		System.out.println("Parent home");
	}
}

class Child100 extends Parent100 {
	void myCar() {
		System.out.println("Child car");
	}
	void myHome() {
		System.out.println("child home");
	}
}

public class upcastingDemo1 {
	public static void main(String[] args) {

		Child100 c2 = new Child100(); // homogeneous so no casting required
		c2.myCar();
		c2.myHome();
		System.out.println("***************Using Upcasting****************");
		//usig casting concept
		Child100 c3 = new Child100();
		c3.myCar();
		c3.myHome();
		//in next line we havent created the obj of parent just use the child class obj by parent reference
		Parent100 c4=c3;//implicit/auto upcasting --->Parent100 c4= c3 = new Child100();
		c4.myHome();
		
		
		Parent100 p2=new Child100();//implicit/auto upcasting		
		Parent100 p1 = (Parent100)new Child100();//explicit up-casting

		Parent100 p4=(Parent100)c3;//explicit up-casting

	}
}
