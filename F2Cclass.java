package AnoBiPackage;

import java.util.Scanner;

public class F2Cclass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float tempC = 0;
		
		System.out.println("Digite a temperatura em Fahrenheit a ser convertida: ");
		float tempF = scn.nextFloat();

		tempC = ((tempF - 32)* 5 / 9);
		System.out.print(tempC + " graus celsius.");
	}

}
