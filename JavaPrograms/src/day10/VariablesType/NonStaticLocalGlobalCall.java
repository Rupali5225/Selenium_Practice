package day10.VariablesType;

/* it will take local variable value because compiler always take local value when name of global n local are same*/
public class NonStaticLocalGlobalCall {

	int empId = 25;

	public static void main(String[] args) {
		
		NonStaticLocalGlobalCall n1 = new NonStaticLocalGlobalCall();
		n1.display();
	}

	void display() {
		int empId = 45;
		System.out.println("I am local empId " + empId);
		System.out.println("I am Global empId " + empId);
	}
}
