package oopsConceptsInJava;

abstract class Dog {
	abstract void makeSound(String sound);
	
	void sayWork()
	{
		System.out.println("Security to Home or Industries");
	}
}

public class JavaMethods extends Dog {
	
	void makeSound(String sound)
	{
		System.out.println(sound);
	}
	
	
	public static void main(String args[])
	{
		JavaMethods dog = new JavaMethods();
		dog.makeSound("wooh...");
		dog.sayWork();
	}
}