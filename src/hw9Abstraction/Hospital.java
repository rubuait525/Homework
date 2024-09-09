package hw9Abstraction;

public interface Hospital {
	//Declare some methods
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	//Step 03: Create one default and one static method morgue and pharmacy inside the interface "Hospital".
	public default void morgue() {
		System.out.println("implemented method by default keyword in interface");
	}
	public static void  pharmacy() {
		System.out.println("Hi! im a static interface method");
	}



}
