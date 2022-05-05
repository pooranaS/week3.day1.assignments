package week3.day1.assignment;

public class Students {

	// creating method with name studentInfo
	public void studentInfo(int id) {

		System.out.println("The id is " + id);
	}

	// overloading method with name studentInfo with diffent arguments
	public void studentinfo(int id, String name) {

		System.out.println("The id and Name is " + id + " and " + name);

	}

	// overloading method with name studentInfo with diffent arguments
	public void studentInfo(String emailid, long phoneNumber) {
		System.out.println("The emailid and PhoneNumber is " + emailid + " and " + phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s =new Students();
		s.studentInfo(3);
		s.studentinfo(3, "Poorna");
		s.studentInfo("spoorana@gmail.com", 9567890433L);
	}

}
