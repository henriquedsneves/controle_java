package controle;

import java.util.Scanner;

public class DesafoSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("digite o dia da semana: ");
		String semana = entrada.next();
		
		
		if(semana.toLowerCase().equals("domingo") ) {
			System.out.println(1);
		}else if (semana.toLowerCase().equals("segunda") ) {
			System.out.println(2);
		}else if(semana.toLowerCase().equals("terça") 
				|| semana.toLowerCase().equals("terca")  ) {
			System.out.println(3);
		}else if(semana.toLowerCase().equals("quarta") ) {
			System.out.println(4);
		}else if(semana.toLowerCase().equals("quinta") ) {
			System.out.println(5);
		}else if(semana.toLowerCase().equals("sexta") ) {
			System.out.println(6);
		}else if(semana.toLowerCase() .equals("sabado") 
				|| semana.toLowerCase() .equals("sábado") ) {
			System.out.println(7);
		}
		
		
		
		entrada.close();
	}

}
