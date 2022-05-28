import java.util.*;

public class Contenedor {
	private String tipo, color, ubicacion;
	private int capacidad;
	
	
	public void leer() {
		System.out.println("-------------------");
		tipo = Leer.dato();
		color =Leer.dato();
		ubicacion = Leer.dato();
		capacidad = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println("Tipo: \n"+tipo + "\nColor: \n" + color + "\nUbicacion: \n" + ubicacion + "\nCapacidad: \n" + capacidad );
	}
	//getter y setters se generan
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
}