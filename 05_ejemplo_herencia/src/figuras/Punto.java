package figuras;

public class Punto {
	private int x,y;
	public Punto (int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void pintar () {
		System.out.print(x+","+ y);
		
	}

}
