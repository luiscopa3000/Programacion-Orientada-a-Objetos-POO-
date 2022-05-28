
public class NodoR {
	private int idRuta;
	private String nombre;
	private NodoR sig;
	
	public NodoR() {
		sig = null;
		
	}
	public int getIdRuta() {
		return idRuta;
	}

	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public NodoR getSig() {
		return sig;
	}

	public void setSig(NodoR sig) {
		this.sig = sig;
	}
	
}
