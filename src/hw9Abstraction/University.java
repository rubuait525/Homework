package hw9Abstraction;

public interface University extends College, Hospital {
	// construction declare
	// public University() {}
	// we can not create a construction inside a interface because interface cannot
	// be instantiated or cannot create an object
	// and interface is a collection methods that are declare or define not
	// implemented

	// Declare some methods
	public void classSize();

	public void playGround();

	public void teacher();
	// Q = How many keywords are used for the inheritance in Interface, answered by
	// Java
	// comments?
	// Ans = we use implements and extends these two keywords for the inheritance in
	// Interface

	/*
	 * Q = Can an interface inherit other Interfaces, or a regular class or abstract
	 * class by extends keyword? How many inheritances are possible? Use the
	 * Interface -- "University" to answer my questions (by multiple line comments).
	 */
	
	/*
	 * Ans = An interface can inherit other Interfaces with extends keyword, an Interface can
	 * inherit more than one Interface (separated by comma) by extends keyword
	 * 
	 * and we can not use extends keywords for regular class or abstract class in
	 * interface
	 */

	public default void gymnasium() {
		System.out.println("here we make implement method in interface by default keyword");

	}

	public static void library() {
		System.out.println("we make one more implement method by static keyword in interface ");
	}

}
