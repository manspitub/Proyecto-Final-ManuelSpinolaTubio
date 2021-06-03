package ejercicio;

public class Main {

	public static void main(String[] args) {
		
//		• Crear una clase llamada punto, con dos atributos (las coordenadas x e y). Añadir el constructor sin
//		parámetros y el constructor con los dos parámetros.
//		• Agregar los métodos get y set para las dos coordenadas.
//		• Hacer una clase de prueba donde se use, los dos constructores, los métodos y se impriman las
//		coordenadas del punto entre paréntesis (por ejemplo (5,3)).
//		• Crear una nueva clase llamada círculo. Los atributos serán las coordenadas x e y del centro y el radio.
//		Debe tener todos los constructores y métodos get y set posibles para todos los atributos.
//		• Añadir a la clase anterior métodos para calcular el diámetro, la longitud de la circunferencia y el área.
//		• Hacer otra clase prueba para la clase círculo. Se deben dar valores en el constructor, cambiarlos por otros
//		leídos desde teclado y calcular con esos últimos el diámetro, la longitud de la circunferencia y el área.
//		• Vamos a realizar ahora la clase círculo2 que hereda de la clase Punto. En ella el único nuevo atributo será
//		el radio, pues las coordenadas ya están en la clase punto. Debe tener el constructor sin parámetros y el
//		constructor con los tres parámetros (uso de super ( )). El correspondiente get y set para el atributo radio y los
//		métodos de cálculo.
//		• Ahora probaremos la clase anterior con una clase llamada PruebaCirculo2. Hacer lo mismo que en las
//		anteriores pruebas.
//		• Por último, intentad sobreescribir y usar polimorfismo con los métodos de cálculo añadiendo lo que
//		consideréis oportuno.
		
		
		
		Punto p1 = new Circulo2(3, 9, 15);
		Circulo c1 = new Circulo();
		Circulo c2 = new  Circulo(5, 2, 10);
		
		System.out.println(c1.calcularArea());
		System.out.println("Su diametro es "+c2.calcularDiametro());
		System.out.println("Su longitud es"+c2.calcularLongitud());		
		System.out.println(p1);
		
	}

}
