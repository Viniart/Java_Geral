package fiap.principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import fiap.forma.Cilindro;
import fiap.forma.Circulo;
import fiap.forma.Forma;

public class Main2 {

	public static void main(String[] args) {
		
		List<Forma> lista = new LinkedList();
		
		lista.add(new Circulo(2,2,2));
		lista.add(new Cilindro(3,3,3,3));
		
		Forma aux;
		for (int i = 0; i < lista.size(); i++) {
			aux = lista.get(i);
			System.out.println(aux);
			System.out.println();
		}
	}

}
