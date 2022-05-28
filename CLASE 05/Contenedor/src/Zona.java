
public class Zona {
	private String nomZona;
	private CCircularC cc = new CCircularC();
	public void leer() {
		System.out.println("Poner nombre de xona");
		nomZona = Leer.dato();
		System.out.println("Introduzca el numero de zonas");
		cc.llenar(Leer.datoInt());
	}
	public void mostrar() {
		System.out.println("\nZona: " + nomZona);
		cc.mostrar();
	}
	public  Zona() {}
	public Zona(String nomZona, CCircularC cc) {
		super();
		this.nomZona = nomZona;
		this.cc = cc;
	}
	public String getNomZona() {
		return nomZona;
	}
	public void setNomZona(String nomZona) {
		this.nomZona = nomZona;
	}
	public CCircularC getCc() {
		return cc;
	}
	public void setCc(CCircularC cc) {
		this.cc = cc;
	}
	
	
}
