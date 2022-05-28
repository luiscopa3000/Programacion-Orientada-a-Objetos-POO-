import java.util.*;
public class Main {

	public static void main(String[] args) {
		CSimpleM A = new CSimpleM();
		System.out.println("_______________");
		//A.llenar( Leer.datoInt());
		//A.mostrar();
		//CcircularU B =  new CcircularU();
		//B.llenar(Leer.datoInt());
		//B.mostrar();
		
		
		
		//Queue<Material> A =new LinkedList<Material>();
		//llenar(A, Leer.datoInt());
		//mostrar(A);
		Material m1 = new Material(1, "n1", "d1", 1);
		Material m2= new Material(2, "n2", "d2", 2);
		Material m3 = new Material(3, "n3", "d3", 3);
		Material m4= new Material(4, "n4", "d4", 4);
		Material m5 = new Material(5, "n5", "d5", 5);
		Material m6= new Material(6, "n6", "d6", 6);
		A.adicionar(m1);
		A.adicionar(m2);
		A.adicionar(m3);
		A.adicionar(m4);
		A.adicionar(m5);
		A.adicionar(m6);
		A.mostrar();
		
		
		
		
		CcircularU b = new CcircularU();
		UsoMaterial u1 = new UsoMaterial("f1", 1, "d1", 3);
		UsoMaterial u2 = new UsoMaterial("f2", 2, "d2", 6);
		UsoMaterial u3 = new UsoMaterial("f3", 3, "d3", 3);
		UsoMaterial u4 = new UsoMaterial("f2", 4, "d4", 4);
		UsoMaterial u5 = new UsoMaterial("f5", 5, "d5", 51);
		UsoMaterial u6 = new UsoMaterial("f6", 6, "d6", 6);
		b.adicionar(u1);
		b.adicionar(u2);
		b.adicionar(u3);
		b.adicionar(u4);
		b.adicionar(u5);
		b.adicionar(u6);
		
		b.mostrar();
		
		total(A, b);
		A.mostrar();
		b.mostrar();
		fechaX(A,b, "f2");
		
		
	}


	public static void llenar(Queue< Material> elem ,int n ) {
		for (int j = 0; j < n; j++) {
			Material x = new Material();
			x.leer();
			elem.add(x);
		}
	}
	public static void mostrar(Queue<Material> v) {
		while (!v.isEmpty()) {
			v.poll().mostrar();
		}
	}
	public static void total(CSimpleM a, CcircularU b) {
		System.out.println("-----MOSTRANDO TOTAL DE MATERIALES USADOS------");
		CSimpleM aux1 = new CSimpleM();
		CcircularU aux2 = new CcircularU();
		while (!a.esvacia()) {
			Material m = a.eliminar();
			aux1.adicionar(m);
			int t = 0;
			while (!b.esvacia()) {
				UsoMaterial u = b.eliminar();
				aux2.adicionar(u);
				if (m.getIdMat() == u.getIdMat()) {
					t = t+ u.getCantidad();
				}
			}
			b.vaciar(aux2);
			System.out.println(m.getNombre() + "------->" + t);
		}
		a.vaciar(aux1);
	}
	public static void fechaX(CSimpleM a, CcircularU b, String x) {

		System.out.println("-----MOSTRANDO TOTAL DE MATERIALES USADOS------");
		CSimpleM aux1 = new CSimpleM();
		CcircularU aux2 = new CcircularU();
		while (!a.esvacia()) {
			Material m = a.eliminar();
			aux1.adicionar(m);
			boolean sw = false;
			while (!b.esvacia()) {
				UsoMaterial u = b.eliminar();
				aux2.adicionar(u);
				if (m.getIdMat() == u.getIdMat() && u.getFecha().equals(x)) {
					sw = true;
				}
			}
			if (sw) {
				System.out.println(m.getNombre());
			}
			b.vaciar(aux2);
		}
		a.vaciar(aux1);
	}

}
