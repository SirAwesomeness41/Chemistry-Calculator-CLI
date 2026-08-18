package chemistryCalculatorCLI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SpecificHeatCalculator {
	public static void menu() throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int varToFind = 0;
		System.out.println("To find the energy needed in Joules, type '1'."
				+ "\nTo find the mass of the substance, type '2'."
				+ "\nTo find the specific heat, type '3'."
				+ "\nTo find the change in temperature, type '4'."
				+ "\nTo return to the main menu, type '5'.");
		varToFind = in.nextInt();
		switch(varToFind){
		case 1:
			energyNeeded(in);
			break;
		case 2:
			mass(in);
			break;
		case 3:
			specificHeat(in);
			break;
		case 4:
			tempChange(in);
			break;
		case 5:
			ChemistryCalculatorMenu.menu();
		default:
			System.out.println("Invalid input.");
			TimeUnit.SECONDS.sleep(1);
			menu();
		}
	}

	private static void energyNeeded(Scanner in) throws InterruptedException {
		double c, m, q, t = 0;
		System.out.print("Mass (in grams): " );
		m = in.nextDouble();
		System.out.print("Specific heat: ");
		c = in.nextDouble();
		System.out.print("Temperature change: ");
		t = in.nextDouble();
		q = m*c*t;
		System.out.println("Energy needed: " + q + " Joules.");
		menu();
	}
		
	private static void mass(Scanner in) throws InterruptedException {
		double c, m, q, t = 0;
		System.out.print("Energy needed (in Joules): ");
		q = in.nextDouble();
		System.out.print("Specific heat: ");
		c = in.nextDouble();
		System.out.print("Temperature change: ");
		t = in.nextDouble();
		double ct = c*t;
		m = q/ct;
		System.out.println("Mass: " + m + " grams.");		
		menu();
	}
		
	private static void specificHeat(Scanner in) throws InterruptedException {
		double c, m, q, t = 0;
		System.out.print("Energy needed (in Joules): ");
		q = in.nextDouble();
		System.out.print("Mass (in grams): " );
		m = in.nextDouble();
		System.out.print("Temperature change: ");
		t = in.nextDouble();
		double mt = m*t;
		c = q/mt;
		System.out.println("Specific heat: " + c + " J/g°C.");
		menu();
	}
		
	private static void tempChange(Scanner in) throws InterruptedException {
		double c, m, q, t = 0;
		System.out.print("Energy needed (in Joules): ");
		q = in.nextDouble();
		System.out.print("Specific heat: ");
		c = in.nextDouble();
		System.out.print("Mass (in grams): " );
		m = in.nextDouble();
		double mc = m*c;
		t = q/mc;
		System.out.println("Temperature change: " + t + " degrees °C.");
		menu();
	}
	
}
