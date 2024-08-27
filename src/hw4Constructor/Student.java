package hw4Constructor;

public class Student {
	// Declare some variable --> name, id, gender, grade (as
	// float),isProgrammer(as// boolean).

	public String name;
	public int id;
	public char gender;
	public float grade;
	public boolean isProgramer;

	// Declare Constructor
	public Student() {
		System.out.println("This is all about Student");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("Student Name" + name);

	}

	public Student(String name, int id, char gender, float grade, boolean isProgramer) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.grade = grade;
		this.isProgramer = isProgramer;
		System.out.println("Student Name: " + name + ", Student ID:  " + id + ", Student Gender: " + gender
				+ " ,Student Grade: " + grade + " ,Is Programmer: " + isProgramer);
	}

}
