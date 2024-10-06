package controle;

import java.util.Scanner;

public class Desafio1Controle {
	public static void main(String[] args) {
		//Criar um programa que receba um número e 
		//verifique se ele está entre 0 e 10 e é par;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um número e descubra se é par");
		double número = entrada.nextDouble();
		
		if(número %2 == 0) {
			System.out.println("é par");
		}else {
			System.out.println("é ímpar");
		}
		
		
		entrada.close();
	}

}
