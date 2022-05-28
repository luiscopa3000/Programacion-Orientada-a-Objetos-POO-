
public class Empresa {
	private String nombre;
	private String tamaño;
	private String tipo;
	public void mostrar() {
		System.out.println("\nEMPRESA[" +nombre + " " + tamaño + " " + tipo + "] ");
	}
	public Empresa() {
	}
	public Empresa(String nombre, String tamaño, String tipo) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
