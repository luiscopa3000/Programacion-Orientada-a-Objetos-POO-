
public class NodoPer {
	private String nombre;
	private String cargo;
	private NodoPer ant;
	private NodoPer sig;
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Cargo: " + cargo);
	}
	public NodoPer() {
		ant = sig = null;
	}
	public NodoPer(String nombre, String cargo, NodoPer ant, NodoPer sig) {
		super();
		this.nombre = nombre;
		this.cargo = cargo;
		this.ant = ant;
		this.sig = sig;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public NodoPer getAnt() {
		return ant;
	}
	public void setAnt(NodoPer ant) {
		this.ant = ant;
	}
	public NodoPer getSig() {
		return sig;
	}
	public void setSig(NodoPer sig) {
		this.sig = sig;
	}
	
	
}
