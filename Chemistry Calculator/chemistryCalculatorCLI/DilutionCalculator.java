package chemistryCalculatorCLI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DilutionCalculator {
	public static void menu() throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int varToFind = 0;
		System.out.println("To find the initial concentration of the solution, type '1'."
				+ "\nTo find the initial volume of the solution, type '2'."
				+ "\nTo find the new concentration, type '3'."
				+ "\nTo find the new volume, type '4'."
				+ "\nTo return to the main menu, type '5'.");
		varToFind = in.nextInt();
		switch(varToFind){
		case 1:
			findInitConc(in);
			break;
		case 2:
			findInitVol(in);
			break;
		case 3:
			findNewConc(in);
			break;
		case 4:
			findNewVol(in);
			break;
		case 5:
			in.close();
			ChemistryCalculatorMenu.menu();
		default:
			System.out.println("Invalid input.");
			TimeUnit.SECONDS.sleep(1);
			menu();
		}
				
	}

	private static void findNewVol(Scanner in) throws InterruptedException {
		double newConc, initConc, initVol, numerator, answer = 0.0;
		System.out.print("Initial concentration: ");
		initConc = in.nextDouble();
		System.out.print("Initial volume: ");
		initVol = in.nextDouble();
		System.out.print("New concentration: ");
		newConc = in.nextDouble();
		//The math
		numerator = initVol*initConc;
		answer = numerator/newConc;
		System.out.println("New volume: " + answer + " units");
		menu();
	}

	private static void findNewConc(Scanner in) throws InterruptedException {
		double newVol, initConc, initVol, numerator, answer = 0.0;
		System.out.print("Initial concentration: ");
		initConc = in.nextDouble();
		System.out.print("Initial volume: ");
		initVol = in.nextDouble();
		System.out.print("New volume: ");
		newVol = in.nextDouble();
		//The math
		numerator = initVol*initConc;
		answer = numerator/newVol;
		System.out.println("New concentration: " + answer + " units");
		menu();
	}

	private static void findInitVol(Scanner in) throws InterruptedException {
		double newConc, newVol, initConc, numerator, answer = 0.0;
		System.out.print("Initial concentration: ");
		initConc = in.nextDouble();
		System.out.print("New concentration: ");
		newConc = in.nextDouble();
		System.out.print("New volume: ");
		newVol = in.nextDouble();
		//The math
		numerator = newVol*newConc;
		System.out.println(numerator);
		answer = numerator/initConc;
		System.out.println("Initial volume: " + answer + " units");
		menu();
	}

	private static void findInitConc(Scanner in) throws InterruptedException {
		double newConc, newVol, initVol, numerator, answer = 0.0;
		System.out.print("Initial volume: ");
		initVol = in.nextDouble();
		System.out.print("New concentration: ");
		newConc = in.nextDouble();
		System.out.print("New volume: ");
		newVol = in.nextDouble();
		//The math
		numerator = newVol*newConc;
		answer = numerator/initVol;
		System.out.println("Initial concentration: " + answer + " units");
		menu();
	}
}
