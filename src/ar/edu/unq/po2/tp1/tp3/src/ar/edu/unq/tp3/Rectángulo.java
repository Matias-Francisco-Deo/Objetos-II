package ar.edu.unq.tp3;

public class Rectángulo {
	private Point esquinaInferiorIzq;
	private Point esquinaInferiorDer;
	private Point esquinaSuperiorIzq;
	private Point esquinaSuperiorDer;
	
	Rectángulo() {
		this.esquinaInferiorIzq = new Point();
		this.esquinaInferiorDer = new Point(2, 0);
		this.esquinaSuperiorIzq = new Point(0, 1);
		this.esquinaSuperiorDer = new Point(1, 1);
	}
	
	Rectángulo(int ancho, int alto) {
		this.esquinaInferiorIzq = new Point();
		this.esquinaInferiorDer = new Point(ancho, 0);
		this.esquinaSuperiorIzq = new Point(0, alto);
		this.esquinaSuperiorDer = new Point(ancho, alto);
	}
	
	public void cambiarAltura(int y) {
		if (y < 1) return;
		this.esquinaSuperiorIzq.moverY(y);
		this.esquinaSuperiorDer.moverY(y);
	}
	
	public void cambiarAncho(int x) {
		if (x < esquinaInferiorIzq.getX()) return;
		this.esquinaInferiorDer.moverX(x);
	}
	
	public int getArea() {
		int base = getBase();
		int altura = getAltura(); //siempre permanece la altura igual
		int área = base * altura;
		return área;
		
	}
	
	public int getPerímetro() {
		int base = getBase();
		int altura = getAltura(); //siempre permanece la altura 
		return 2*base + 2*altura; 
	}

	private int getAltura() {
		return this.esquinaSuperiorDer.getY();
	}

	private int getBase() {
		return this.esquinaInferiorIzq.getX() + this.esquinaInferiorDer.getX();
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
