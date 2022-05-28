
public class Material {
	private int idMat;
	private String nombre;
	private String descripci�n;
	private int stock;
	Material(){}
    Material(int idMat, String nombre, String descripci�n, int stock)
    {
    	this.idMat=idMat;
    	this.nombre=nombre;
    	this.descripci�n=descripci�n;
    	this.stock=stock;
    }
	public void leer() {
		System.out.println("Leendo datos");
		System.out.println("Introduce el idMat");
		this.idMat = Leer.datoInt();
		System.out.println("Introduce el nombre");
		nombre = Leer.dato();
		System.out.println("Introduce la descripcion");
		descripci�n = Leer.dato();
		System.out.println("Introduce el stock");
		stock = Leer.datoInt();
	}
	public void mostrar() {
		System.out.println("<"+idMat + ", "+ nombre+ ", "+descripci�n +", "+ stock+">");
	}
	public int getIdMat() {
		return idMat;
	}
	public void setIdMat(int idMat) {
		this.idMat = idMat;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripci�n() {
		return descripci�n;
	}
	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
