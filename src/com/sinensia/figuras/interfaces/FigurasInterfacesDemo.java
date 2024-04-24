package com.sinensia.figuras.interfaces;

public class FigurasInterfacesDemo {

	public static void main(String[] args) {
		
		Figura cuadrado = new CuadradoImpl(2d, 3d);
		System.out.println("Perimetro del cuadrado = " + ((CuadradoImpl)cuadrado).getPerimetro());
		
		// En este caso utilizando solo interfaces sin ninguna clase de la que heredar tendremos
		// que estar duplicando mucho código como los propios atributos comunes a todas las clases.
	}
	
}
