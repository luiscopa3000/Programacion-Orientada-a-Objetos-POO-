package Partic;

import java.util.*;
public class Main {
	public static void llenar(Vector<Participante>v ,int n ) {
		for (int j = 0; j < n; j++) {
			Participante x = new Participante();
			x.leer();
			v.add(x);
		}
	}
	public static void PartDeVect1AndVec2(Vector<Participante>v ,Vector<Participante>v1) {
		System.out.println("-------------------------------------2. mostrar a los participantes del primer vector que estan en el segunto vector---------------------------------");
		for (int i = 0; i < v.size(); i++) {
			for (int j = 0; j < v1.size(); j++) {
				if (v.get(i).getNombre().equals(v1.get(j).getNombre())) {
					if (v.get(i).getPaterno().equals(v1.get(j).getPaterno())) {
						if (v.get(i).getMaterno().equals(v1.get(j).getMaterno())) {
							v.get(i).mostrar();
						}
					}
				}
			}
		}
	}
	public static void trasladarParticipantes(Vector<Participante>v ,Vector<Participante>v1) {
		System.out.println("------------------------------3. insertar a todos los participantes del segundo vector, despues del i-esimo del primer vector----------------------------------");
		int c= v1.size()+v.size();
		Participante aux[] = new Participante[50];
		int c1 = 0;
		for (int i = 0; i < v1.size() ; i++) {
			aux[i] = v1.get(i);
		}
		for (int i = 0; i < v1.size(); i++) {
			v.add(aux[i]);
			v1.remove(i);
		}
	}
	public static void mostrar(Vector<Participante>v ) {
		for (int i = 0; i<v.size(); i++) {
			v.get(i).mostrar();
		}
	}
	public static void main(String[] args) {
		Vector<Participante> P1 = new Vector<Participante>();
		Vector<Participante> P2= new Vector<Participante>();
		System.out.println("----------------------1.. llenar y mostrar dos vectores------------------------");
		System.out.println("Llenando VEctor 1"+ "\nIntroduzca una cantidad");
		llenar(P1,Leer.datoInt());
		System.out.println("Llenando VEctor 2"+ "\nIntroduzca una cantidad");
		llenar(P2,Leer.datoInt());
		mostrar(P1);
		mostrar(P2);
		PartDeVect1AndVec2(P1, P2);
		trasladarParticipantes(P1, P2);
		System.out.println("Mostrando objeto 1");
		mostrar(P1);
		mostrar(P2);
		System.out.println("Mostrando objeto 2");
	}

}
