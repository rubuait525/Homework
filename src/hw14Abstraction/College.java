package hw14Abstraction;

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
	
}
