package AnoBiPackage;

import java.util.Scanner;

public class PrestacaoClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//Input
		System.out.println("Digite o valor: ");
		float valor = scn.nextFloat();
		
		System.out.println("Digite o valor da porcentagem da taxa: ");
		float taxa = scn.nextFloat();
		
		System.out.println("Digite o tempo: ");
		float tempo = scn.nextFloat();
		
		// Proc
		
		float prest = valor + (valor * (taxa / 100) * tempo);
		float parcela = prest / tempo;

		// Output
		System.out.printf("O valor da prestação a ser pago é de R$ %.2f \n", (prest));
		System.out.printf("O valor de cada prestação a ser pago em juros simples é de R$ %.2f", (parcela));
	}

}
