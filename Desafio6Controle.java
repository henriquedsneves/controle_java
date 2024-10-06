package controle;

import java.util.Scanner;

public class Desafio6Controle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 10;
		

		for (int i = 1; i <= 10; i++) {
			System.out.println("Escolha um número de 1 até 100");
			int numeroEscolido = entrada.nextInt();
			
			if(numeroEscolido > 100 && numeroEscolido < 10 ) { 
				System.out.println("Numero inválido");
				
			}else if(numeroEscolido > numero  ) { 
					System.out.println("O número escolido e menor");
			
				
			}else if(numeroEscolido < numero) {
						System.out.println("O número é maior");
			}else if (numeroEscolido == numero) 
						System.out.println("Você acertou!!!!!!");
			
			}
							
				entrada.close();			
		}					
	}
