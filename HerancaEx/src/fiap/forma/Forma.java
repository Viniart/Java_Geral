package fiap.forma;

public abstract class Forma {

	protected int coordenadaX;
	protected int coordenadaY;
	protected double raio;
	
	public Forma(int coordenadaX, int coordenadaY, double raio) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.raio = raio;
	}

	public abstract double calcularArea();
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Coordenada x: " + coordenadaX + "\n";
		aux += "Coordenada y: " + coordenadaY + "\n";
		aux += "Raio: " + raio + "\n";
		return aux;
	}
	
}
