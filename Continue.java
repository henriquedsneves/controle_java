package controle;



public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i <10; i++) {
			if(i %2 == 1 )
				continue;

			System.out.println(i);
		}
		System.out.println("OUTRA PARTE DO CÓDIGO");
		
		for(int i = 1; i < 10; i++) {
			if(i == 5 )
				continue;
			System.out.println(i);
		}
		
	}

}
