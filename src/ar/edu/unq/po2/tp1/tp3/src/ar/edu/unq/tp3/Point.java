package ar.edu.unq.tp3;

public class Point {
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void moverX(int x) {
		this.x = x;
	}
	
	public void moverY(int y) {
		this.y = y;
	}
	
	public void moverXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sumarPuntos(Point a, Point b) {
		return new Point(a.x + this.x, b.y + this.y);
	}
	
}
