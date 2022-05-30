import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		int[] x = new int[5];
	
		preencher(x);
		
		listar(x);
		
		System.out.println("MAIOR: " + retornarMaior(x));
		
	
	}

	public static void preencher(int[] x) { 
		Random gerador = new Random();
		
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(10);
		}
		
	}
	
	public static void listar(int[] x) { 
		
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(x[i] + "\n");
//		}
		
		for(int i : x) {
			System.out.println(i + "\n");
		}
		
	}
	
	public static int retornarMaior(int[] x) {
		
		int maiorValor = x[0];
		for (int j = 0; j < x.length - 1; j++) {
			if(maiorValor < x[j + 1]) {
				maiorValor = x[j + 1];
			}
		}
			
		return maiorValor;
	
	}
	
}
