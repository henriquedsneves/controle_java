package controle;

import java.util.Scanner;

public class Desafio2Controle {
	public static void main(String[] args) {
		//Criar um programa informa se o ano atual é um ano bissexto
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos dias tem esse ano? ");
		int diasAno = entrada.nextInt();
		
		if(diasAno == 366) {
			System.out.println("É um ano bissexto!");
		}else {
			System.out.println("É um ano normal! ");
		}
			
		
		entrada.close();
	}

}
