package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	// declare variable
	public int birthMonth;
	public int age;

	// default constructor
	public Daughter() {
		System.out.println("This is a default constructor from Dauther class");

		super.father();
		super.fatherInfo("JoneSmith", 75, 'M', true);
	}

	// Parameterized constructor
	public Daughter(int birthMonth, int age) {
		super("Smith", 60, 'F', true);
		super.father();
		super.fatherInfo("jone", 55, 'M', false);
		super.familyName = "Smith";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This parameterized constructor from Dauther class ");
		System.out.println("<<<Daughter's Information>>>" + "\nbirth Month: " + birthMonth + "\nAge: " + age
				+ "\nfamilyName: " + familyName);
	}

	// void type method
	public void daughter() {
		System.out.println("This is a regular void type method from Daughter class");

	}

	// Parameterized void type method
	public void daughterInfo(int birthMonth, int age) {
		super.father();
		super.fatherInfo("BrownSmith", 80, 'M', true);
		super.familyName = "Jackson";

		System.out.println("This parameterized method from Dauther class ");
		System.out.println("<<<Daughter's Information>>>" + "\nbirth Month: " + birthMonth + "\nAge: " + age
				+ "\nFamily Name: " + familyName);

	}

}
