package week10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {

	static Scanner userinput = new Scanner(System.in);

	static double average(List<Double> nums) {
		double avg, total;
		int i;
		total = 0;

		for (i = 0; i < nums.size(); i++) {
			total += nums.get(i);
		}

		avg = (double) total / (double) i;

		return avg;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myAvg;
		int q;
		int j = 0;

		List<Double> numbers = new ArrayList<>();

		System.out.println("How many numbers would you like to input --> ");
		q = userinput.nextInt();
		userinput.nextLine();

		while (j < q) {
			System.out.println("Num " + (j + 1) + ": ");
			numbers.add(userinput.nextDouble());
			userinput.nextLine();

			j++;

		}

		myAvg = average(numbers);

		System.out.printf("The average of the numbers is %.2f", myAvg);

	}

}
