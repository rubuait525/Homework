package hw7Abstraction;

public abstract class EngineeringSchool {
	// Step 03: Create another Abstract Class EngineeringSchool, create 2 methods
	// inside the Abstract Class - one is abstract and another one is the
	// non-abstract name -- mechanicalLab and computerLab. Print something inside
	// the non-abstract or implemented method.
	
	//Abstract method
	public abstract void mechanicalLab();
	//Non Abstract or implemented method
	public void computerLab() {
		System.out.println("This is Implemented Method from EngineeringSchool class");
	}

}
