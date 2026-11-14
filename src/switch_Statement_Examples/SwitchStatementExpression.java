package switch_Statement_Examples;
import java.util.*;

public class SwitchStatementExpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Grade option A or B");
		String grade = scanner.next();
		scanner.close();
		
		int value = switch(grade) {
		case "A" -> {
			System.out.println("value will be 100");
			yield 100;
		}
		case "B" -> {
			System.out.println("Value will be 50");
			yield 50;
		}
		default -> {
			System.out.println("Value will be 25");
			yield 25;
		}
		};
		
		System.out.println("Value is "+ value);
	}
}
