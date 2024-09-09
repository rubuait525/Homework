package hw9Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();
	
	public default void dorm() {
		System.out.println("we create a implemented method by using default keyword");
	}

	public static void studyRoom() {
		System.out.println("we create a implemented method by using static keyword");
	}
	// How many keywords are used for the inheritance in Interface, answered by Java
	// comments?
	//we use implements and extends these two keywords for the inheritance in Interface
	
	//University extends College, Hospital. Can an interface inherit
	// other Interfaces, or a regular class or abstract class by extends keyword?
	// How many inheritances are possible? Use the Interface -- "University" to
	// answer my questions (by multiple line comments).

}
