package hw13Polymorphism;
/*
 * Method overriding = When different methods exist with the same method name with same parameters or signature but 
 * with different syntax or logic, it is called method overriding. 
 * Method Overriding occurs during run time.
 */

public class Niece extends Sister {
	@Override
	public void sister() {
		System.out.println("This is a void type method (1) of Niece class");

	}

	@Override
	public void sister(int age1, int age2) {
		int nieceTotal1 = (age1 + age2 + 65);
		System.out.println("this is a Nice Total1: " + nieceTotal1);
		System.out.println("This is a void parameterized method (2) of Nice class");

	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int nieceTotal2 = (age1 + age2 + age3 * 3);
		System.out.println("This is a return type parameterized method (3) of Niece class");
		System.out.println("This is a NieceTotal2: " + nieceTotal2);
		return nieceTotal2;
	}

	@Override
	public void sister(int age1, String age2, int age3) {
		int Niecetotal3 = (age1 + Integer.parseInt(age2) + age3 + 44);
		System.out.println("this is a Niece Total3:" + Niecetotal3);
		System.out.println("This is a void type parameterized method (4) of Niece class ");

	}

	@Override
	public void sister(int age1, int age2, int age3, int age4) {
		int total2 = (age1 + age2 + age3 + age3 + age4);
		System.out.println("Total age of sister is:" + total2);
		System.out.println("This is a void type parameterized method (5) of Nice class");
	}

	@Override
	public int sister(int age1, int age2, float age3, int age4, String age5) {
		int NieceTotal3 = (age1 + age2 + (int) age2 + age4 + Integer.parseInt(age5) / 4);
		System.out.println("Total age of nice is:" + NieceTotal3);
		System.out.println("This is a return type parameterized method (6) of Sister class");
		return NieceTotal3;
	}
	/*
	 * @Override public final int sister(int age1, int age2, int age3, int age4, int
	 * age5) { int total4 = (age1 + age2 + age3 + age4 + age5);
	 * System.out.println("Total age of sister is:" + total4);
	 * System.out.println("This is a return type final method (7) of Sister class");
	 * return total4; }
	 * 
	 * Return type parameterized method which is final and implemented Final type
	 * method cannot be Overridden because final keyword doesn't allow any changes
	 * in the method, variable, class
	 *
	 */

	/*
	 * @Override public static void sister(int age2, int age5, String age3) { int
	 * total5 = (age2 * age5 * Integer.parseInt(age3));
	 * System.out.println("This is a multiplication age of sisters age: " + total5);
	 * System.out.println("This is a void type static method (8) of Sister class");
	 * }
	 * 
	 * Static type Method implemented method sister cannot override because static
	 * is a local member method of a class So, static method can't be override, if
	 * we remove @override it will work as it is considered as the static method of
	 * this Nice class
	 * 
	 */

}
