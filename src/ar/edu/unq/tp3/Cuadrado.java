package ar.edu.unq.tp3;

public class Cuadrado {
	private Point esquinaInferiorIzq;
	private Point esquinaInferiorDer;
	private Point esquinaSuperiorIzq;
	private Point esquinaSuperiorDer;
	
	public Cuadrado() {
		this.esquinaInferiorIzq = new Point(0, 0);
		this.esquinaInferiorDer = new Point(1, 0);
		this.esquinaSuperiorIzq = new Point(0, 1);
		this.esquinaSuperiorDer = new Point(1, 1);
	}
	
	Cuadrado(int ancho, int alto) {
		this.esquinaInferiorIzq = new Point();
		this.esquinaInferiorDer = new Point(ancho, 0);
		this.esquinaSuperiorIzq = new Point(0, alto);
		this.esquinaSuperiorDer = new Point(ancho, alto);
		if (getBase() != getAltura()) {throw new RuntimeException("Debe ser un cuadrado");};
	}
	
	public void cambiarAltura(int y) {
		if (y < 1) return;
		this.esquinaSuperiorIzq.moverY(y);
		this.esquinaSuperiorDer.moverY(y);
		if (getBase() != getAltura()) {throw new RuntimeException("Debe ser un cuadrado");};
	}
	
	public void cambiarAncho(int x) {
		if (x < esquinaInferiorIzq.getX()) return;
		this.esquinaInferiorDer.moverX(x);
		if (getBase() != getAltura()) {throw new RuntimeException("Debe ser un cuadrado");};
	}
	
	public int getArea() {
		int base = getBase();
		int altura = getAltura(); //siempre permanece la altura igual
		int área = base * altura;
		return área;
		
	}

	private int getAltura() {
		return this.esquinaSuperiorDer.getY();
	}

	private int getBase() {
		return this.esquinaInferiorIzq.getX() + this.esquinaInferiorDer.getX();
	}
	
	public int getPerímetro() {
		int base = getBase();
		int altura = getAltura(); //siempre permanece la altura 
		return 2*base + 2*altura; 
	}
	
	public boolean esHorizontal() {
		int base = getBase();
		int altura = getAltura(); //siempre permanece la altura 
		return base > altura;
	}
	
	public boolean esVertical() {
		int base = getBase();
		int altura = getAltura(); //siempre permanece la altura 
		return altura > base;
	}
	
}
