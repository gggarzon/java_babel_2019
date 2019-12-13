package model;

public class Ciudad {
	
	private String nombre;
	private int habitantes;
	private double temp;
	
	public Ciudad(String nombre, int habitantes, double temp) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.temp = temp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	

}
