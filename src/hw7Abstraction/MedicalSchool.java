package hw7Abstraction;

public abstract class MedicalSchool {

	// We can declare a Constructor inside a Abstract Class
	public MedicalSchool() {
		System.out.println("Im a default constructor of a Abstract class");
	}

	// Abstract Method
	public abstract void anatomyLab();

	// Non Abstract Method or Implemented Method
	public void biochemistryLab() {
		System.out.println("This is a Non Abstract Method from MedicalSchool class");
	}

}
