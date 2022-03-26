package interviews;

public class Dog extends Animal {
	final String breed;

	public Dog(String breed) {
		this.breed = breed;
		System.out.println("Dog constructor");
	}

	public void barking() {
		System.out.println("Dog barking 1");
		super.barking();
		System.out.println("Dog barking 2");
	}
}
