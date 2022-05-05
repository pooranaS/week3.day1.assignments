package week3.day1.assignment;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("The deposit method in axisbank class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bi= new AxisBank();
		bi.saving();
		bi.fixed();
		bi.deposit();
		
		
	}

}
