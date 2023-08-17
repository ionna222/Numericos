package AnoBiPackage;

import java.util.Scanner;

public class AnoCalcClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Digite um ano abaixo:");
		int ano = scn.nextInt();
		
		if(ano % 4 == 0) {
			System.out.print("O ano é bissexto.");
		}
			else {
				System.out.print("O ano não é bissexto");
		}
		
	}

}

