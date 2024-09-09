package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {

	// We can declare a Constructor inside a Abstract Class
	public MedicalSchool() {
		System.out.println("Im a default constructor of a Abstract class");
	}

	/*
	 * Ans = An abstract class can inherit only one abstract class or one regular class by extends keyword
	 * An abstract class can't inherit an Interface by extends key word
	 * implements keyword is used to inherit Interface in abstract class
	 * an abstract class can inherit more than one Interface
	 * an abstract class cannot inherit a regular class or abstract class by implements keyword

	 */

	// Abstract Method
	public abstract void anatomyLab();

	// Non Abstract Method or Implemented Method
	public void biochemistryLab() {
		System.out.println("This is a Non Abstract Method from MedicalSchool class");
	}

}
