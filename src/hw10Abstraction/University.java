package hw10Abstraction;

public interface University extends College, Hospital {
	

	// Declare some methods
	public void classSize();

	public void playGround();

	public void teacher();
	

	public default void gymnasium() {
		System.out.println("here we make implement method in interface by default keyword");

	}

	public static void library() {
		System.out.println("we make one more implement method by static keyword in interface ");
	}

}
