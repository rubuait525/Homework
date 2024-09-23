package hw10UseOfSuperInChildClass;

public class Father {
	// variable declare
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor
	public Father() {
		System.out.println("This is a default constructor from Father class");
	}

	// Parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("This is a Parameterized constructor of Father class");
		System.out.println("<<<Family Information>>>" + "\nName: " + name + "\nAge: " + age + "\nSex: " + sex
				+ "\nUs Citizen: " + usCitizen);
	}

	// void type method
	public void father() {
		System.out.println("This is a regular void type mehtod from Father class");
	}

	// void type parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("<<<Family Informathion>>>" + "\nName: " + name + "\nAge: " + age + "\nSex: " + sex
				+ "\nUs Citizen: " + usCitizen);

	}

}
