package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite um número: ");
		double número = Integer.parseInt(valor);
		
		if(número % 2 == 0 ) {
			System.out.println("Esse número é par!!!");
		}else {
			System.out.println("Esse número é ímpar!!");
		}
			
	}

}
