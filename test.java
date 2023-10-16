import acm.program.ConsoleProgram;

public class test extends ConsoleProgram {
	public void run() {
		double a = readDouble("Enter the number: ");
		println("The integer part of this number is: " + (int) a + " and the decimal part is: " + ( a - (int) a));
	}
}