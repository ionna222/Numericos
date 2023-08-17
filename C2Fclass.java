package AnoBiPackage;

import java.util.Scanner;

public class C2Fclass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float tempF = 0;
				
		System.out.println("Digite a temperatura em Celsius abaixo.");
		float tempC = scn.nextFloat();
		
		tempF = tempC * 9 / 5 + 32;
		System.out.print(tempF + " graus em Fahrenheit!");
	}

}
