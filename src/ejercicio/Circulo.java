package ejercicio;

public class Circulo {
	
	private int x;
	private int yCentro;
	private double radio;
	
	public Circulo(int x, int yCentro, double radio) {
		super();
		this.x = x;
		this.yCentro = yCentro;
		this.radio = radio;
	}

	public Circulo() {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getyCentro() {
		return yCentro;
	}

	public void setyCentro(int yCentro) {
		this.yCentro = yCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [x=" + x + ", yCentro=" + yCentro + ", radio=" + radio + "]";
	}
	
	public double calcularDiametro() {
		return radio*2;
	}
	
	public double calcularLongitud() {
		double pi= 3.14;
		return calcularDiametro()*pi;
	}
	
	public double calcularArea() {
		double pi= 3.14;
		return pi*radio*radio;
	}
	
	
	
	
	
	
	
}
