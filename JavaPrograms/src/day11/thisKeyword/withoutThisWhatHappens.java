package day11.thisKeyword;

 class ThisKeyword1 {

	int rollno;
	float fee;
	int s = 15;
	ThisKeyword1(int rollno, float fee) {	
		this.rollno = rollno;
		fee = fee;
		System.out.println(this.rollno + " 1 " +  fee);

	}
	void display() {

		System.out.println(rollno + " " +  fee);
	}
	
}
  class withoutThisWhatHappens {
	public static void main(String[] args) {
		int s = 10;

		// TODO Auto-generated method stub
		ThisKeyword1 s1 = new ThisKeyword1(111, 5000f);
		s1.display();//
		ThisKeyword1 s2 = new ThisKeyword1(112, 6000f);
		s2.display();//
	}


}
