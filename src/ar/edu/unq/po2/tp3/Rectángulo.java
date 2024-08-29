package ar.edu.unq.po2.tp3;

public class Rectángulo {
	private Point esquinaInferiorIzq;
	private Point esquinaInferiorDer;
	private Point esquinaSuperiorIzq;
	private Point esquinaSuperiorDer;
	
	Rectángulo() {
		this.esquinaInferiorIzq = new Point(0, 0);
		this.esquinaInferiorDer = new Point(2, 0);
		this.esquinaSuperiorIzq = new Point(0, 1);
		this.esquinaSuperiorDer = new Point(1, 1);
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
		int base = this.esquinaInferiorIzq.getX() + this.esquinaInferiorDer.getX();
		int altura = this.esquinaSuperiorDer.getY(); //siempre permanece la altura igual
		int área = base * altura;
		return área;
		
	}
	
	public int getPerímetro() {
		int base = this.esquinaInferiorIzq.getX() + this.esquinaInferiorDer.getX();
		int altura = this.esquinaSuperiorDer.getY(); //siempre permanece la altura 
		return 2*base + 2*altura; 
	}
	
	public boolean esHorizontal() {
		int base = this.esquinaInferiorIzq.getX() + this.esquinaInferiorDer.getX();
		int altura = this.esquinaSuperiorDer.getY(); //siempre permanece la altura 
		return base > altura;
	}
	
	public boolean esVertical() {
		int base = this.esquinaInferiorIzq.getX() + this.esquinaInferiorDer.getX();
		int altura = this.esquinaSuperiorDer.getY(); //siempre permanece la altura 
		return altura > base;
	}
	
}
