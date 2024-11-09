package week10;

import java.util.Scanner;

public class Metals {

	static Scanner userinput = new Scanner(System.in);

	static double convertFromCelcius(String to, double temp) {
		double answer = temp;
		if (to.charAt(0) == 'f') {
			answer = (9.0 / 5) * answer + 32;
		}
		if (to.charAt(0) == 'r') {
			answer = (9.0 / 5) * answer + 492;
		}
		if (to.charAt(0) == 'k') {
			answer = answer + 273;
		}
		return answer;
	}

	public static void main(String[] args) {

		double mp, mpf, bp, bpf, density;
		String name, cond, to;
		int hardness;
		cond = "yes";
		to = "f";

		while (cond.equals("yes")) {
			System.out.println("Enter the metal's name --> ");
			name = userinput.nextLine();
			System.out.println("Enter the metal's density (g/cm^3)--> ");
			density = userinput.nextDouble();
			userinput.nextLine();
			System.out.println("Enter the metal's melting point in C--> ");
			mp = userinput.nextDouble();
			userinput.nextLine();
			System.out.println("Enter the metal's boiling point in C --> ");
			bp = userinput.nextDouble();
			userinput.nextLine();
			System.out.println("Enter the metal's hardness --> ");
			hardness = userinput.nextInt();
			userinput.nextLine();

			mpf = convertFromCelcius(to, mp);
			bpf = convertFromCelcius(to, bp);

			System.out.println(name);
			System.out.println("_______________________");
			System.out.printf("density: %.2f g/cm^3", density);
			System.out.printf("\nMelting Point: %.2f F", mpf);
			System.out.printf("\nBoiling Point: %.2f F", bpf);
			System.out.println("\nHardness: " + hardness);

			System.out.println("\nWould you like to record another metal? (yes/no)");
			cond = userinput.nextLine();

		}

	}

}
