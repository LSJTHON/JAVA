package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Cat cat = new Cat();
		
		dog.breath();
		dog.sound();
		
		cat.breath();
		cat.sound();
		
		System.out.println();
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
