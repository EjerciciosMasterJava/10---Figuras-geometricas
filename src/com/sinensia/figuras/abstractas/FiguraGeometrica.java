package com.sinensia.figuras.abstractas;

public abstract class FiguraGeometrica {

	private Double Ancho;
	private Double Alto;
	private Double Area;
	private Double Perimetro;
	
	public FiguraGeometrica(Double ancho, Double alto) {
		super();
		Ancho = ancho;
		Alto = alto;
	}
	public Double getAncho() {
		return Ancho;
	}
	public void setAncho(Double ancho) {
		Ancho = ancho;
	}
	public Double getAlto() {
		return Alto;
	}
	public void setAlto(Double alto) {
		Alto = alto;
	}

	
}
