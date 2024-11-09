package week10;

import java.util.Scanner;

public class MonthlyPayments {

	static Scanner userinput = new Scanner(System.in);

	static double computePayment(double loanAmt, double rate, int numPeriods) {
		numPeriods = numPeriods * 12;
		double interest = ((rate / 100.0)) / 12;
		double answer = loanAmt
				* ((interest * Math.pow(1 + interest, numPeriods)) / ((Math.pow(1 + interest, numPeriods)) - 1));
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Monthly Mortgage Calculator");
		System.out.print("\nEnter principle: ");
		double a = userinput.nextDouble();
		System.out.print("Enter yearly interest rate without percent: ");
		double b = userinput.nextDouble();
		System.out.print("Enter number of years: ");
		int c = userinput.nextInt();
		System.out.printf("\nThe monthly payment is $%.2f", computePayment(a, b, c));
	}

}
