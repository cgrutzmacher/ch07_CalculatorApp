import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		boolean choice = true;
		Scanner sc = new Scanner(System.in);
		int calcChoice = 0;
		int int1 = 0;
		int int2 = 0;
		int int3 = 0;
		double dbl1 = 0;
		double dbl2 = 0;
		double dbl3 = 0;
		
		System.out.println("Welcome to the calculator app.");
		
		
		while(choice) {
			
			calcChoice = Validator.getInt(sc, Calculator.displayMenu(), 1, 5);
			
			if(calcChoice == 1 || calcChoice == 2) {
				int1 = Validator.getInt(sc, "Enter Whole Number 1: ");
				int2 = Validator.getInt(sc, "Enter Whole Number 2: ");
				
				if (calcChoice == 1) {
					System.out.printf("The Sum of %d and %d is: %d\n", int1, int2, Calculator.sum(int1, int2));
				}
				if (calcChoice == 2) {
					int3 = Validator.getInt(sc, "Enter Whole Number 3: ");
					System.out.printf("The Sum of %d, %d, and %d is: %d\n", int1, int2, int3, Calculator.sum(int1, int2, int3));
				}
				
			} else if (calcChoice == 3 || calcChoice == 4) {
				dbl1 = Validator.getDouble(sc, "Enter Decimal Number 1: ");
				dbl2 = Validator.getDouble(sc, "Enter Decimal Number 2: ");
				
				if (calcChoice == 3) {
					System.out.printf("The Sum of %.2f and %.2f is: %.2f\n", dbl1, dbl2, Calculator.sum(dbl1, dbl2));
				}				
				if (calcChoice == 4) {
					dbl3 = Validator.getDouble(sc, "Enter Decimal Number 3: ");
					System.out.printf("The Sum of %.2f, %.2f, and %.2f is: %.2f\n", dbl1, dbl2, dbl3, Calculator.sum(dbl1, dbl2, dbl3));
				}
				
			} else {
				choice = false;
				continue;
			}
			
			
			choice = Validator.getChoiceBool(sc, "Continue? (y/n) ", "y", "n");
		}
		
		System.out.println("Goodbye");

	}
	

}
