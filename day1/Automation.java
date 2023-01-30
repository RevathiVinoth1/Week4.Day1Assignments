package week4.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {
		public void javapgm() {
			System.out.println("I am the Best Java Programmer");
		}
		public void selenium() {
			System.out.println("I am Learning Selenium for Automation Testing ");
		}
		public void ruby() {
			System.out.println("I Want to Learn Ruby");
		}
		
		public static void main(String[] args) {
			Automation auto=new Automation();
			auto.javapgm();
			auto.selenium();
			auto.phyton();
			auto.ruby();
		}
}
