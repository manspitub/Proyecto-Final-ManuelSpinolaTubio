package ejercicio;

public class Main {

	public static void main(String[] args) {
		
//		� Crear una clase llamada punto, con dos atributos (las coordenadas x e y). A�adir el constructor sin
//		par�metros y el constructor con los dos par�metros.
//		� Agregar los m�todos get y set para las dos coordenadas.
//		� Hacer una clase de prueba donde se use, los dos constructores, los m�todos y se impriman las
//		coordenadas del punto entre par�ntesis (por ejemplo (5,3)).
//		� Crear una nueva clase llamada c�rculo. Los atributos ser�n las coordenadas x e y del centro y el radio.
//		Debe tener todos los constructores y m�todos get y set posibles para todos los atributos.
//		� A�adir a la clase anterior m�todos para calcular el di�metro, la longitud de la circunferencia y el �rea.
//		� Hacer otra clase prueba para la clase c�rculo. Se deben dar valores en el constructor, cambiarlos por otros
//		le�dos desde teclado y calcular con esos �ltimos el di�metro, la longitud de la circunferencia y el �rea.
//		� Vamos a realizar ahora la clase c�rculo2 que hereda de la clase Punto. En ella el �nico nuevo atributo ser�
//		el radio, pues las coordenadas ya est�n en la clase punto. Debe tener el constructor sin par�metros y el
//		constructor con los tres par�metros (uso de super ( )). El correspondiente get y set para el atributo radio y los
//		m�todos de c�lculo.
//		� Ahora probaremos la clase anterior con una clase llamada PruebaCirculo2. Hacer lo mismo que en las
//		anteriores pruebas.
//		� Por �ltimo, intentad sobreescribir y usar polimorfismo con los m�todos de c�lculo a�adiendo lo que
//		consider�is oportuno.
		
		
		
		Punto p1 = new Circulo2(3, 9, 15);
		Circulo c1 = new Circulo();
		Circulo c2 = new  Circulo(5, 2, 10);
		
		System.out.println(c1.calcularArea());
		System.out.println("Su diametro es "+c2.calcularDiametro());
		System.out.println("Su longitud es"+c2.calcularLongitud());		
		System.out.println(p1);
		
	}

}
