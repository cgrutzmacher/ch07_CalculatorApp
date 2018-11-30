
public class Calculator {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static double sum(double a, double b, double c) {
		return a + b + c;
	}
	
	public static String displayMenu() {
		String menu = "Menu:\n\t1 - add two whole numbers\n"
				+ "\t2 - Add three whole numbers\n"
				+ "\t3 - Add two decimals\n"
				+ "\t4 - Add three decimals\n"
				+ "\t5 - Exit\n:  ";
		return menu;		
	}

}
