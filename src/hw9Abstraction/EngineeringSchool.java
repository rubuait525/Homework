package hw9Abstraction;

public abstract class EngineeringSchool {
	
	//Abstract method
	public abstract void mechanicalLab();
	//Non Abstract or implemented method
	public void computerLab() {
		System.out.println("This is Implemented Method from EngineeringSchool class");
	}

}
