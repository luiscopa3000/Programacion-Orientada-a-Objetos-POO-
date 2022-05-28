
public class Contenedor {
	private String color;
	private String ubiaccion;
	private int capacidad;
	public void mostrar() {
		System.out.print("["+color);
		System.out.print(" "+ ubiaccion+ " ");
		System.out.println(capacidad+"]");
	}
	public void leer() {
		System.out.println("Color");
		this.color = Leer.dato();
		System.out.println("Ubicacion");
		this.ubiaccion = Leer.dato();
		System.out.println("CApacidad");
		this.capacidad = Leer.datoInt();
	}
	public Contenedor() {}
	public Contenedor(String color, String ubiaccion, int capacidad) {
		super();
		this.color = color;
		this.ubiaccion = ubiaccion;
		this.capacidad = capacidad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUbiaccion() {
		return ubiaccion;
	}
	public void setUbiaccion(String ubiaccion) {
		this.ubiaccion = ubiaccion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}
