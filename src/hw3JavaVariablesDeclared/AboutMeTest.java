package hw3JavaVariablesDeclared;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe ruby = new AboutMe(); // Constructor initialized

		// variable initialized
		ruby.myName = "ruby";
		ruby.myAge = 100;
		ruby.myGender = 'F';
		ruby.myId = true;
		ruby.mySalary = 300.200f;
		ruby.myHealthInsuranceNo = 808080l;
		ruby.myHeight = 5.455;
		ruby.myZipcode = 6456;
		ruby.myPhoneBill = 100;

		ruby.aboutMe(); // method initialized

		AboutMe alex = new AboutMe(); // Constructor initialized

		// variable initialized
		alex.myName = "Alex";
		alex.myAge = 200;
		alex.myGender = 'M';
		alex.myId = false;
		alex.mySalary = 302.000f;
		alex.myHealthInsuranceNo = 565656556l;
		alex.myHeight = 4.440;
		alex.myZipcode = 6464;
		alex.myPhoneBill = 44;

		alex.aboutMe(); // method initialized

	}

}
