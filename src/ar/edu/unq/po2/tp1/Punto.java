package ar.edu.unq.po2.tp1;

public class Punto implements Nombrable {
	

	public int x = 0;
	public int y = 0;
			
	public void setY(int newY) {
		this.y = newY;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Punto";
	}
	
	public void reconocer(Nombrable nombrable) {
		System.out.println(nombrable.getNombre());
	}
}
