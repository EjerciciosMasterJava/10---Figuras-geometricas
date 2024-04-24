package com.sinensia.figuras.interfaces;

public class Rectangulo implements Figura{

	private Double ancho;
	private Double alto;

	public Rectangulo(Double ancho, Double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public Double getPerimetro() {
		return alto * 2 + ancho * 2;
	}

	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return null;
	}

}
