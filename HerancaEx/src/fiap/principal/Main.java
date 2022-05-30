package fiap.principal;

import fiap.forma.Cilindro;
import fiap.forma.Circulo;
import fiap.forma.Forma;
import fiap.volume.Volume;

public class Main {

	public static void main(String[] args) {
		
		Forma[] formas = new Forma[4];
		
		formas[0] = new Circulo(1, 1, 1.5);
		formas[1] = new Cilindro(3, 3, 4.5, 2);
		formas[2] = new Circulo(2, 2, 2.5);
		formas[3] = new Cilindro(1, 1, 1.5, 5);

		for (Forma f : formas) {
			System.out.println(f);
			System.out.println("Área: " + f.calcularArea());
			
			if(f instanceof Volume) {
				System.out.println("Volume = " + ((Volume)f).calcularVolume());
			}
			System.out.println();
			
		}
	}

}
