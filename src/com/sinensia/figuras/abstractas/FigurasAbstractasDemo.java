package com.sinensia.figuras.abstractas;

public class FigurasAbstractasDemo {

	public static void main(String[] args) {
		FiguraGeometrica cuadrado = new Cuadrado(2d, 3d);
		System.out.println("perimetro cuadrado = " + ((Cuadrado)cuadrado).getPerimetro());
		
		// En este caso utilizando solo clases abstractas sin interfaces es más complicado identificar
		// cuáles son los métodos que son comunenes a cada clase ya que no nos obliga a hacer un Override
		// Tampoco podríamos reutilizar interfaces que se podrían usar para ciertas clases solamente.
	}
}
