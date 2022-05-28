package Partic;

public class Participante {
	private String nombre,paterno,materno;
	public void leer() {
		System.out.println("Introduzca el nombre");
		nombre = Leer.dato();
		System.out.println("Introduzca el AP PAterno");
		paterno = Leer.dato();
		System.out.println("Introduzca el AP materno");
		materno = Leer.dato();
	}
	public void mostrar() {
		System.out.println("Nombre:\n"+nombre + "\nApellido Paterno\n"+paterno + "\nAp Materno\n"+materno);
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
}
