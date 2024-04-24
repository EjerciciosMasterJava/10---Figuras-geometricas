package com.sinensia.figuras.abstractasInterfaces;

public class Triangulo implements Figura{
	
	private Double base;
	private Double altura;

	public Triangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}

}
