package oopsConceptsInJava.inheritanceConcept;

public class Tiger {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAnimalAge(10);
		animal.setAnimalColor("Orange");
		animal.setAnimalName("Tiger");
		
		System.out.println("Animal is "+animal.getAnimalName());
		System.out.println("Animal Age is "+animal.getAnimalAge());
		System.out.println("Animal Color is "+animal.getAnimalColor());

	}

}
