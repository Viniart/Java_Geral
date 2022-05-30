
public class Ex2 {

	public static void main(String[] args) {
		
		int[] x = {2,6,7,9,12};
		
		double[] y = {1.5, 4.6, 7.8, 3.3};
		
		String[] z = {"Carlos", "Kaiser", "Júnior"};

	}
	
	public static void imprimir(int[] x) {
		for(int i : x) {
			System.out.println("Int: " + i);
		}
	}
	
	public static void imprimir(double[] y) {
		for(double d : y) {
			System.out.println("Double: " + d);
		}
	}

	public static void imprimir(String[] z) {
		for(String s : z) {
			System.out.println("String: " + s);
		}
	}
}