package AnoBiPackage;

import java.util.Scanner;

public class AutomovelClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// Input
		System.out.println("Digite os minutos gasto na viagem.");
		short temp = scn.nextShort();
		
		System.out.println("Agora, digite a velocidade média.");
		short vel = scn.nextShort();
		
		// Proc
		
		float dist = temp * vel;
		float litros = dist / 12;
		
		// Output
				
		System.out.println("O tempo é de " + temp);
		System.out.println("A velocidade média é " + vel);
		System.out.println("A distância percorrida é de " + dist);
		System.out.println("Os litros de combustível utilizado foi de " + litros);
	}

}
