package hw14Abstraction;

/*
 * Ans = A regular class can inherit only one regular class or one abstract
	 * class by extends keyword and a regular class can't inherit an Interface by
	 * extends keyword, Implements keyword is used to inherit Interface in regular
	 * class and a regular class can inherit more than one Interface but a regular
	 * class cannot inherit a regular class or abstract class by Implements keyword
	 * and extends keyword is use before implements keywords if regular class,
	 * abstract class, interface need to be inherited
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	public ColumbiaUniversity() {
		System.out.println("I am a default contructor of ColumbiaUniversity class");
	}

	public void biology() {
		System.out.println("this is non abstract mehtod from a regular class");
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

}
