package hw2JavaVariablesInitialized;



public class AboutMe {

	// variable declared
	public String country;
	
	public String myName = "ruby";
	public int myAge = 100;
	public char myGender = 'M';
	public boolean myId  = true;
	public float mySalary = 200.33f;
	public long myHealthInsuranceNo = 22222l;
	public double myHeight = 5.534555;
	public short myZipcode = 30000;
	public byte myPhoneBill = 100;

	// Constructor is declared
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");
	}
	

	// implement void type method
	public void aboutMe() {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Gender:" + myGender + "\nMy ID: " + myId + "\nMy Salary: " + mySalary + "\nMy Health Insurance Number: " + myHealthInsuranceNo + "\nMy Height: " + myHeight + "\nMy Zipcode: " + myZipcode + "\nMy Bill: " + myPhoneBill);
	}
	
	public static void main(String[] args) {
		
		AboutMe ruby = new AboutMe(); //class instantiated //constructor initialized
		ruby.aboutMe();
	}
	

}
