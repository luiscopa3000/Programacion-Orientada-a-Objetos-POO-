
public class NodoO {
	//Lista Simple ObjPerdidos<fecha, nombre, descripcion, idBus> datos
	private String fecha;
	private String nombre;
	private String descripcion;
	private int idBus;
	private NodoO sig;
	
	public NodoO() {
		sig = null;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdBus() {
		return idBus;
	}

	public void setIdBus(int idBus) {
		this.idBus = idBus;
	}

	public NodoO getSig() {
		return sig;
	}

	public void setSig(NodoO sig) {
		this.sig = sig;
	}
	
}
