package Lista2;

import java.util.Scanner;

public class A_e_B_Class {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		
		// In
		
		System.out.println("Digite o valor da variável A");
		int varA = scn.nextInt();
		
		System.out.println("Digite o valor da variável B");
		int varB = scn.nextInt();
		
		// Pro
		int varC = varA;
			varA = varB;
			varB = varC;
		
		// Out
			System.out.println("Variável A: " + varA);
			System.out.println("Variável B: " + varB);
		}

}
