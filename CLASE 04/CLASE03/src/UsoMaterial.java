
public class UsoMaterial {
	private String fecha;
	private int idMat;
	private String destino;
	private int cantidad;
	UsoMaterial(){}
    UsoMaterial(String fecha, int idMat, String destino, int cantidad)
    {
        this.fecha=fecha;
        this.idMat=idMat;
        this.destino=destino;
        this.cantidad=cantidad;
    }
	public void leer() {
		System.out.println("Leendo datos");
		System.out.println("Introduce la fecha");
		this.fecha = Leer.dato();
		System.out.println("Introduce el idMat");
		idMat = Leer.datoInt();
		System.out.println("Introduce el destino");
		destino = Leer.dato();
		System.out.println("Introduce la cantidad");
		cantidad = Leer.datoInt();
	}
	public void mostrar() {
		System.out.println("<"+fecha + ", "+ idMat+ ", "+destino +", "+ cantidad+">");
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getIdMat() {
		return idMat;
	}
	public void setIdMat(int idMat) {
		this.idMat = idMat;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
