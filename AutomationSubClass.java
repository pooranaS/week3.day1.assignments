package week3.day1.assignment;

public class AutomationSubClass extends AutomationSuperClass implements Language, Testtool {

	public void java(int id) {
		System.out.println("this is java language");
	}

	public void selenium() {
		System.out.println("tool is selenium");
	}

	public void Automation() {
		System.out.println("This is Sub class");
	}

	public void keyword() {
		this.Automation();
		super.Automation();
	}

	public static void main(String args[])
	{
	AutomationSubClass asc= new AutomationSubClass();
	asc.java(3);
	asc.selenium();
	asc.keyword();
}
}
