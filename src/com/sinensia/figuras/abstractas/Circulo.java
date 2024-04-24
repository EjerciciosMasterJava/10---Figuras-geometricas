package com.sinensia.figuras.abstractas;

public class Circulo extends FiguraGeometrica{

	public Circulo(Double ancho, Double alto) {
		super(ancho, alto);
	}

	public Double getPerimetro() {
		return getAncho()*2 + getAlto()*2;
	}
	
	public Double getArea() {
		return getAncho() * getAlto();
	}
	
}
