package switch_Statement_Examples;
import java.util.*;

public class SwitchStatementExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the grade");	
		String grade = scanner.next();
		scanner.close();
		
		String message;
		
		switch(grade)
		{
		case "A":
			message = "Myself Prem";
			break;
		case "B":
			message = "Myself Kumar";
			break;
		default:
			message = "Myself Sangakkara";
		}
		
		System.out.println(message);
		
	}

}
