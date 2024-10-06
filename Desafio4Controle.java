package controle;

import java.util.Scanner;

public class Desafio4Controle {


		public static void main(String[] args) {

			
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nDigite um numero para verificar se é primo:");
			int numero = scanner.nextInt();
			int contadorDeDivisores = 0;
			
			
// O número primo só tem 2 divizoes, a do 1 e a de ele mesmo.Não pode dar quebrado!!
			for (int i = 2; i < numero; i++) { 
// começa do 2 e vai até um  número antes do escolido e vai almentado de 1 em 1
//nós titamos a possibilidade do 1 e ele mesmo		
				if (numero % i == 0) {
// se o resto da divisão for 0 almenta o número de contadores.
// se o número não for primos vão existir 1 ou mais divisões aumentado no contador					
					contadorDeDivisores++;
					
					
				}
			}
// EX:9 -> i = 2 3 4 5 6 7 8. Divisores de 9 = [3]; contador = 1. Não é primo
// EX:5 -> i = 2 3 4. Divisores = [NENHUM] CONTADOR = 0 NÚMERO PRIMO
			if (contadorDeDivisores == 0) {

				System.out.println("\nO numero " + numero + " é primo.");
			} else {
				System.out.println("\nO numero " + numero + " não é primo.");
			}

			scanner.close();

		}

	}
