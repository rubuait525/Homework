package hw14Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {
	// Abstract Method
	public abstract void hygiene();

	// Non Abstract method
	public void caring() {
		System.out.println("This is a non abstract method from NursingSchool class");
	}

}
