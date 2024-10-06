package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("informe a sua nota: ");
		double nota = entrada.nextDouble();
		
		if (nota <= 10 && nota>= 7) {
			System.out.println("Aprovado parabéns");
		}
			
		entrada.close();
	}

}
