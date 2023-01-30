package week4.day1;

public class FinalClass1 extends FinalClass {
	public void add() {
		System.out.println("Addition");
	}
	public static void main(String[] args) {
		FinalClass1 fin=new FinalClass1();
		fin.num3();
		fin.add();
		fin.num1();
		System.out.println(FinalClass.a);
		System.out.println(FinalClass.b);
		//System.out.println(fin.num1);
	}
	

}
