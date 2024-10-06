package controle;

import java.util.Scanner;

public class Desafio5Controle {
	public static void main(String[] args) {
		int contadorDivisores = 0 ;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++) {
			switch(numero % i) {
			case  0:
				contadorDivisores++;
				break;
				
			}	
		}
			
		switch(contadorDivisores ) {
		case 0:
			System.out.println("Seu número é primo");
			break;
		default:
			System.out.println("Seu número não é primo");
			
		}
		
		entrada.close();
		
	}

}
