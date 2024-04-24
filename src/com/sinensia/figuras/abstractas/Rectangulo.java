package com.sinensia.figuras.abstractas;

public class Rectangulo extends FiguraGeometrica{

	public Rectangulo(Double ancho, Double alto) {
		super(ancho, alto);
	}

	public Double getPerimetro() {
		return getAncho()*2 + getAlto()*2;
	}
	
	public Double getArea() {
		return getAncho() * getAlto();
	}
	
}
