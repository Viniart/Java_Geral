package fiap.forma;

import fiap.volume.Volume;

public class Cilindro extends Forma implements Volume {
	
	private double altura;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
		super(coordenadaX, coordenadaY, raio);
		this.altura = altura;
	}
	
	public double calcularArea() {
		double areaCirculo = Math.PI * (raio * raio);
		double areaRetangulo = 2 * Math.PI * raio * altura;
		
		return areaCirculo * 2 + areaRetangulo;
	}
	
	public double calcularVolume() {
		return 0;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Altura: " + altura + "\n";
		return aux;
	}
}
