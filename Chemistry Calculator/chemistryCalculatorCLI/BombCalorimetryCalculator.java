package chemistryCalculatorCLI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BombCalorimetryCalculator {
	public static void menu() throws InterruptedException {
		Scanner in = new Scanner(System.in);
		final double waterSpecHeat = 4.184;
		System.out.print("Mass of water: ");
		double waterMass = in.nextDouble();
		System.out.print("Heat capacity of bomb: ");
		double heatCapacity = in.nextDouble();
		System.out.print("Temperature change: ");
		double tempChange = in.nextDouble();
		double adder1 = waterMass*waterSpecHeat*tempChange;
		double adder2 = heatCapacity*tempChange;
		double result = adder1+adder2;
		System.out.println("Energy needed: " + result + " Joules.");
		in.close();
		TimeUnit.SECONDS.sleep(1);
		ChemistryCalculatorMenu.menu();
	}
}
