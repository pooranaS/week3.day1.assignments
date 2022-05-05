package week3.day1.assignments.org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("The desktop size is 30 inches");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop com = new Desktop();
		com.ComputerModel();
		com.desktopSize();
	}

}
