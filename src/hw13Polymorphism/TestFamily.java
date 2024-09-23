package hw13Polymorphism;

public class TestFamily {
	public static void main(String[] args) {

		Sister sister = new Sister();
		sister.sister();
		sister.sister(20, 12);
		sister.sister(10, 20, 50);
		sister.sister(13, "33", 9);
		sister.sister(10, 20, 30, 40);
		sister.sister(10, 20, 30, 40, "5");
		sister.sister(23, 33, 43, 53, 63);
		Sister.sister(14, 8, "10");

		System.out.println("---------------------------------------------------------------------");

		Niece niece = new Niece();
		niece.sister();
		niece.sister(12, 12);
		niece.sister(10, 20, 30);
		niece.sister(22, 33, 44, 55);
		niece.sister(20, 40, 10, 30, "10");
		niece.sister(5, 6, 7, 8, 9);

	}

}
