package ejercicio;

public class Circulo2 extends Punto{

	private int radio;

	public Circulo2(int x, int y, int radio) {
		super(x, y);
		this.radio = radio;
	}

	public Circulo2(int x, int y) {
		super(x, y);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo2 [radio=" + radio + ", getX()=" + getX() + ", getY()=" + getY() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	public double calcularDiametro() {
		return  radio*2;
	}
	
	
	
	
	
}
