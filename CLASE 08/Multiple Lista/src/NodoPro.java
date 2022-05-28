 
public class NodoPro {
	private String nombre;
	private String tipo;
	private int precio;
	private String entrega;
	private NodoPro sig;
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Tipo: " + tipo);
		System.out.println("Precio: " + precio);
		System.out.println("Entrega: " + entrega);
	}
	public NodoPro() {
		sig = null;
	}
	public NodoPro(String nombre, String tipo, int precio, String entrega, NodoPro sig) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.entrega = entrega;
		this.sig = sig;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getEntrega() {
		return entrega;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	public NodoPro getSig() {
		return sig;
	}
	public void setSig(NodoPro sig) {
		this.sig = sig;
	}
	
}
