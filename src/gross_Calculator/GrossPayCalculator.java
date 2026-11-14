package gross_Calculator;

import java.util.*;

public class GrossPayCalculator {
	
	public static double grossPayCalculation(int amnt1, double amnt2)
	{
		return amnt1 * amnt2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Amount Details: \n");
		
		int amnt1 = scanner.nextInt();
		double amnt2 = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("Calculated grosspay is "+ (float) grossPayCalculation(amnt1,amnt2));

	}

}
