package oopsConceptsInJava;

class State {
	int id;
	String name;
	String capital;
	
	void printStateDetails()
	{
		System.out.println("State Detais...");
		System.out.println("State ID : "+id);
		System.out.println("State Name: "+name);
		System.out.println("State Capital: "+capital);
	}
}

class TamilNadu extends State {
	void printTamilNaduDetails() {
		super.id = 1;
		super.name = "TamilNadu";
		super.capital = "Chennai";
		
		printStateDetails();
	}
}

class Karnataka extends State {
	void printKarnatakaDetails() {
		printStateDetails();
		super.id = 2;
		super.name = "Karnataka";
		super.capital = "Bengaluru";

		printStateDetails();
	}
}



public class JavaInheritance
{
	public static void main(String args[])
	{
		TamilNadu tamil = new TamilNadu();
		Karnataka kannada = new Karnataka();
		
		tamil.printTamilNaduDetails();
		tamil.printStateDetails();
		kannada.printKarnatakaDetails();
	}
}