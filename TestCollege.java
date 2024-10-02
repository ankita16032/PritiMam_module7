package module7;

class Stream {
	private String type;
	private int fees;
	private int noOfStudents;

	public Stream(String type, int fees, int noOfStudents) {
		super();
		this.type = type;
		this.fees = fees;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Stream [type=" + type + ", fees=" + fees + ", noOfStudents=" + noOfStudents + "]";
	}

}

class College {
	private String name;
	private char grade;
	private String address;
	private String contactNo;

	public College(String name, char grade, String address, String contactNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNo=" + contactNo + "]";
	}

}

public class TestCollege {

	public static void main(String[] args) {

		College college = new College("MET", 'A', "Pune", "78899455");
		Stream stream = new Stream("CS", 70000, 80);
		Stream stream1 = new Stream("IT", 50000, 80);
		Stream stream2 = new Stream("Mech", 65000, 80);
		Stream stream3 = new Stream("Robotics", 99000, 80);
		Stream stream4 = new Stream("Aueronotics", 90000, 80);
		System.out.println(college);
		System.out.println(stream);
		System.out.println(stream1);
		System.out.println(stream2);
		System.out.println(stream3);
		System.out.println(stream4);
	}

}
