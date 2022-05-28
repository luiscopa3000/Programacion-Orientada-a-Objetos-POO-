
public class Bus {
	private int idBus, idRuta;
	private String conductor, tipo;
	public void mostrar() {
		System.out.println("<"+idBus+" " + idRuta+ " " + conductor + " " +tipo+ ">");
	}
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	public Bus(int idBus, int idRuta, String conductor, String tipo) {
		super();
		this.idBus = idBus;
		this.idRuta = idRuta;
		this.conductor = conductor;
		this.tipo = tipo;
	}
	public int getIdBus() {
		return idBus;
	}
	public void setIdBus(int idBus) {
		this.idBus = idBus;
	}
	public int getIdRuta() {
		return idRuta;
	}
	public void setIdRuta(int idRuta) {
		this.idRuta = idRuta;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
