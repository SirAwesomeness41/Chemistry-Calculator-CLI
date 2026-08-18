package chemistryCalculatorCLI;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Ethan Hamernik
// 8/17/2026
//
//


public class ChemistryCalculatorMenu {
	public static void menu() throws InterruptedException {
		Scanner in = new Scanner(System.in);
		System.out.println("Options: \nDilution (type 1)\nSpecific heat (type 2)\nCalorimetry (type 3)\nBomb Calorimetry (type 4)\nEnd application (type 5)");
		int equationType = in.nextInt();
		switch(equationType) {
		case 1:
			DilutionCalculator.menu();
			break;
		case 2:
			SpecificHeatCalculator.menu();
			break;
		case 3:
			CalorimetryCalculator.menu();
			break;
		case 4:
			BombCalorimetryCalculator.menu();
			break;
		case 5:
			System.out.print("Terminating.");
			in.close();
			System.exit(0);
			break;
		default:
			System.out.println("Invalid input.");
			TimeUnit.SECONDS.sleep(1);
			menu();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		menu();
		}
	}
