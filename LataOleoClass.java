package AnoBiPackage;

import java.util.Scanner;
import java.lang.Math;
		
public class LataOleoClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		double volume = 0;
		
		System.out.println("Digite o valor do raio da lata:");
		double raio = scn.nextDouble();
		
		System.out.println("Digite o valor da altura da lata:");
		double altura = scn.nextDouble();
		
		volume = 3.14159 * raio * Math.pow(raio, 2) * altura;
		System.out.println(volume + " é o volume");
	}

}
