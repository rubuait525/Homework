package hw5JavaMethods;

public class MyFamily {

	public int child1Age = 1;
	public int child2Age = 3;
	public int child3Age = 5;
	public int child4Age = 7;

	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;
		System.out.println("The sum of my childrens age is: " + sum);

		return sum;

	}

	public static void main(String[] args) {
		MyFamily family = new MyFamily();
		family.myFamily();

	}
}
