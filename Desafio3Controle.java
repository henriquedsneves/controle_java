package controle;

import java.util.Scanner;

public class Desafio3Controle {
	public static void main(String[] args) {
		// Criar um programa que receba duas notas parciais, 
		//calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime
		//no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 
		//imprime no console "Recuperação", 
		//caso contrário imprime no console "Reprovado".
		
		Scanner entrada = new Scanner(System.in);
		double nota = 0 ;
		double total = 0;
		double quantidadeNota = 0;
			
		while(nota != -1) {
			System.out.println("Digite a sua nota: \nAo finalizar digite -1!!!!");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNota++;
			}else if (nota > 10 && nota <0){
				System.out.println("Nota inválida");
				
			} 
			
		}
		double média = total / quantidadeNota;
		
		 if(média >= 7.1) {
			System.out.println("Aprovado");
		}else if(média >= 4.1 && média <= 7) {
			System.out.println("Recuperação");
		}else if(média >= 0 && média <= 4) {
			System.out.println("Reprovado");
		}
	
		entrada.close();
}	
}

	


