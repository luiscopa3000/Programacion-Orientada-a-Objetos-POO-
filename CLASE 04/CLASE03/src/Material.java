
public class Material {
	private int idMat;
	private String nombre;
	private String descripción;
	private int stock;
	Material(){}
    Material(int idMat, String nombre, String descripción, int stock)
    {
    	this.idMat=idMat;
    	this.nombre=nombre;
    	this.descripción=descripción;
    	this.stock=stock;
    }
	public void leer() {
		System.out.println("Leendo datos");
		System.out.println("Introduce el idMat");
		this.idMat = Leer.datoInt();
		System.out.println("Introduce el nombre");
		nombre = Leer.dato();
		System.out.println("Introduce la descripcion");
		descripción = Leer.dato();
		System.out.println("Introduce el stock");
		stock = Leer.datoInt();
	}
	public void mostrar() {
		System.out.println("<"+idMat + ", "+ nombre+ ", "+descripción +", "+ stock+">");
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
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
