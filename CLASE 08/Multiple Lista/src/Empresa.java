
public class Empresa {
	private String nombre;
	private String tama�o;
	private String tipo;
	public void mostrar() {
		System.out.println("\nEMPRESA[" +nombre + " " + tama�o + " " + tipo + "] ");
	}
	public Empresa() {
	}
	public Empresa(String nombre, String tama�o, String tipo) {
		super();
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
