package chemistryCalculatorCLI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalorimetryCalculator {
	public static void menu() throws InterruptedException {
		Scanner in = new Scanner(System.in);
		int varToFind = 0;
		System.out.println("To find the system's mass, type '1'."
				+ "\nTo find the system's temperature change, type '2'."
				+ "\nTo find the system's specific heat, type '3'."
				+ "\nTo find the water's mass, type '4'."
				+ "\nTo find the water's temperature change, type '5'."
				+ "\nTo return to the main menu, type '6'.");
		switch(varToFind) {
		case 1:
			systemMass(4.184, in);
			break;
		case 2:
			systemTempChange(4.184, in);
			break;
		case 3:
			systemSpecificHeat(4.184, in);
			break;
		case 4:
			waterMass(4.184, in);
			break;
		case 5:
			waterTempChange(4.184, in);
			break;
		case 6:
			in.close();
			ChemistryCalculatorMenu.menu();
		default:
			System.out.println("Invalid input.");
			TimeUnit.SECONDS.sleep(1);
			menu();
		}
	}

	private static void systemMass(double waterSpecHeat, Scanner in) throws InterruptedException {
		double systemMass = 0, systemTemp = 0, systemSpecHeat = 0, waterMass = 0, waterTemp = 0;
		System.out.print("System temperature change: ");
		systemTemp = in.nextDouble();
		System.out.print("System specific heat: ");
		systemSpecHeat = in.nextDouble();
		System.out.print("Mass of water: ");
		waterMass = in.nextDouble();
		System.out.print("Temperature change of water: ");
		waterTemp = in.nextDouble();
		double waterAttributes = waterSpecHeat*waterMass*waterTemp;
		double systemAttributes = systemSpecHeat*systemTemp;
		systemMass = waterAttributes/systemAttributes;
		System.out.println("Mass of system: " + systemMass + " grams.");
		menu();
	}

	private static void systemTempChange(double waterSpecHeat, Scanner in) throws InterruptedException {
		double systemMass = 0, systemTemp = 0, systemSpecHeat = 0, waterMass = 0, waterTemp = 0;
		System.out.print("Mass of system: ");
		systemMass = in.nextDouble();
		System.out.print("System specific heat: ");
		systemSpecHeat = in.nextDouble();
		System.out.print("Mass of water: ");
		waterMass = in.nextDouble();
		System.out.print("Temperature change of water: ");
		waterTemp = in.nextDouble();
		double waterAttributes = waterSpecHeat*waterMass*waterTemp;
		double systemAttributes = systemMass*systemSpecHeat;
		systemTemp = waterAttributes/systemAttributes;
		System.out.println("System temperature change: " + systemTemp + " degrees °C.");
		menu();
	}

	private static void systemSpecificHeat(double waterSpecHeat, Scanner in) throws InterruptedException {
		double systemMass = 0, systemTemp = 0, systemSpecHeat = 0, waterMass = 0, waterTemp = 0;
		System.out.print("Mass of system: ");
		systemMass = in.nextDouble();
		System.out.print("System temperature change: ");
		systemTemp = in.nextDouble();
		System.out.print("Mass of water: ");
		waterMass = in.nextDouble();
		System.out.print("Temperature change of water: ");
		waterTemp = in.nextDouble();
		double waterAttributes = waterSpecHeat*waterMass*waterTemp;
		double systemAttributes = systemMass*systemTemp;
		systemSpecHeat = waterAttributes/systemAttributes;
		System.out.println("System specific heat: " + systemSpecHeat + " J/g°C.");
		menu();
	}

	private static void waterMass(double waterSpecHeat, Scanner in) throws InterruptedException {
		double systemMass = 0, systemTemp = 0, systemSpecHeat = 0, waterMass = 0, waterTemp = 0;
		System.out.print("Mass of system: ");
		systemMass = in.nextDouble();
		System.out.print("System temperature change: ");
		systemTemp = in.nextDouble();
		System.out.print("System specific heat: ");
		systemSpecHeat = in.nextDouble();
		System.out.print("Temperature change of water: ");
		waterTemp = in.nextDouble();
		double waterAttributes = waterSpecHeat*waterTemp;
		double systemAttributes = systemMass*systemTemp*systemSpecHeat;
		waterMass = waterAttributes/systemAttributes;
		System.out.println("Mass of water: " + waterMass + " grams.");
		menu();
	}

	private static void waterTempChange(double waterSpecHeat, Scanner in) throws InterruptedException {
		double systemMass = 0, systemTemp = 0, systemSpecHeat = 0, waterMass = 0, waterTemp = 0;
		System.out.print("Mass of system: ");
		systemMass = in.nextDouble();
		System.out.print("System temperature change: ");
		systemTemp = in.nextDouble();
		System.out.print("System specific heat: ");
		systemSpecHeat = in.nextDouble();
		System.out.print("Mass of water: ");
		waterMass = in.nextDouble();
		double waterAttributes = waterSpecHeat*waterMass;
		double systemAttributes = systemMass*systemTemp*systemSpecHeat;
		waterTemp = waterAttributes/systemAttributes;
		System.out.println("Temperature change of water: " + waterTemp + " degrees °C.");
		menu();
	}
}
