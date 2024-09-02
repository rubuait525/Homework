package hw7Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo(); // No inheritance

		System.out.println("___________________________________________________");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Single inheritance

		System.out.println("____________________________________________________");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo(); // Multilevel inheritance
		dog.animalInfo(); 
		System.out.println("____________________________________________________");
		BullDog bullDog = new BullDog();
		bullDog.bullDognfo();
		bullDog.dogInfo(); // Multilevel inheritance
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("_____________________________________________________");
		Reptile reptile = new Reptile();
		reptile.reptilenfo(); // Single inheritance
		reptile.animalInfo();

		System.out.println("_____________________________________________________");
		Snake snake = new Snake();
		snake.snakeInfo(); // Multilevel Inheritance
		snake.reptilenfo();
		snake.animalInfo();

		System.out.println("______________________________________________________");
		Cobra cobra = new Cobra();
		cobra.cobraInfo(); // Multilevel Inheritance
		cobra.snakeInfo();
		cobra.reptilenfo();
		cobra.animalInfo();

		System.out.println("______________________________________________________");
		Birds birds = new Birds();
		birds.birdInfo(); // single inheritance
		birds.animalInfo();

		System.out.println("______________________________________________________");
		Robin robin = new Robin();
		robin.robinInfo(); // Multilevel inheritance
		robin.birdInfo();
		robin.animalInfo();

		// Mammal extends Animal,Reptile extends Animal and bird extends Animal
		// Example of Hierarchical Inheritance

		// Cobra extends Snake, Snake extends Reptile, Reptile extends Animal
		// Example of Multilevel Inheritance
		
		//Animal is the parent class or base class for mammal,reptile and bird class
		//Mammal,Reptile and Bird is child class of Animal class

	}

}
