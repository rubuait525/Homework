package hw3JavaVariablesDeclared;

public class AboutMe {

	// variable declared
	public String country;

	public String myName;
	public int myAge;
	public char myGender;
	public boolean myId;
	public float mySalary;
	public long myHealthInsuranceNo;
	public double myHeight;
	public short myZipcode;
	public byte myPhoneBill;
	//

	// Constructor is declared
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");
	}

	// implement void type method
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Gender:" + myGender + "\nMy ID: " + myId
				+ "\nMy Salary: " + mySalary + "\nMy Health Insurance Number: " + myHealthInsuranceNo + "\nMy Height: "
				+ myHeight + "\nMy Zipcode: " + myZipcode + "\nMy Bill: " + myPhoneBill);
	}

}
