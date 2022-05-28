import java.util.*;

public class Main {

	public static void llenar(Vector<Contenedor>v ,int n ) {
		for (int j = 0; j < n; j++) {
			Contenedor x = new Contenedor();
			x.leer();
			v.add(x);
		}
	}
	public static void mostrar(Vector<Contenedor> v) {
		for (int i = 0; i < v.size(); i++) {
			v.get(i).mostrar();
		}
	}
	public static void contar (Vector<Contenedor> v) {
		System.out.println("Introduzac el color x");
		String x = Leer.dato();
		int c = 0;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getColor().equals(x)) {
				c++;
			}
		}
		System.out.println("La cantidad de colores x es de: " +c );
	}

	public static void capacidad (Vector<Contenedor> v) {
		System.out.println("Introduzac la capacidad x");
		int x = Leer.datoInt();
		int c = 0;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getCapacidad() > x) {
				c++;
			}
		}
		if (x >0) {

			System.out.println("Existen " +c+ " cantidad de contenedores con capacidad " +x);
		} else {
			System.out.println("No existen contenedires");
		}
	}
	public static void verificar(Vector<Contenedor> v) {
		
	}
	public static void main(String[] args) {
		Vector<Contenedor> A = new Vector<Contenedor>();
		llenar(A,Leer.datoInt());
		mostrar(A);
		for (int i = 0; i < A.size(); i++) {
			A.get(i).mostrar();
		}
		//contar(A);
		capacidad(A);
	}
	
	//PROBLEMAS
    //1. Cuantos son del color X
    //2. Verificar si existe contenedores con una capacidad mayor a X
    //3. insertar k nuevos contenedores despues del i-esimo contenedor
    //4. eliminar el i-esimo contenedor

}
