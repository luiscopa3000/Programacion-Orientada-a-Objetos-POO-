
public class Verdura {
	private String nombre, color,unidadMedida, tipo;
	private int precio;
	
	
	public void leer() {
		nombre = Leer.dato();
		color = Leer.dato();
		tipo = Leer.dato();
		precio = Leer.datoInt();
		unidadMedida = Leer.dato();
	}
	
	public void mostrar() {
		System.out.println(nombre+" , " + color+" , " + tipo+" , "+ precio +" , "+ unidadMedida);
	}
	
	public Verdura() {
		this.color = "Rojo";
		this.nombre = "Manzana";
		this.precio = 13;
		this.unidadMedida = ",...";
		this.tipo = "Fruta";
	}
	
	public Verdura(String nombre, String color, String unidadMedida, int precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.unidadMedida = unidadMedida;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
