package controle;

import java.util.Scanner;

public class Desafio7Controle {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		 /**
		  * 7. Criar um programa que enquanto estiver recebendo números positivos,
		  * imprime no console a soma dos números inseridos, caso receba um número
		  * negativo, encerre o programa. Tente utilizar a estrutura do while.
		  */

		 int somadorDeNumeros = 0;
		  int numero = 0;

		  while (numero >= 0) {
		   System.out.println("Digite um numero inteiro (ou negativo para sair): ");
		   numero = entrada.nextInt();
		   if (numero >= 0) {
		    somadorDeNumeros += numero; // Isso é igual a somadorDeNumeros = somadorDeNumeros + numero;
		    System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
		   }
		  }
		  entrada.close();
		 }
	}


