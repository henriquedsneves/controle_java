package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadedenotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("informe a nota ou digite -1 para sair: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota>=0) {
				total += nota;
				quantidadedenotas ++;
				
			}else if(nota != -1) {
				System.out.println("nota inválida");
			}
		
	
			}
		double media = total / quantidadedenotas;
		System.out.println("Média: " + media);
		entrada.close();
	}

}
