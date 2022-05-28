
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack<Verdura> A= new Stack<Verdura>();
		cargar(A,Leer.datoInt());
		mostrar(A);
		//Cuantas verduras tienen el precio x?
		System.out.println("-----------Contar---------");
		contar(A, Leer.datoInt());
		//Sean dos Stacks intercambiar sus k primeras verduras
		/*Stack<Verdura> B= new Stack<Verdura>();
		cargar(B,Leer.datoInt());
		System.out.println("----------------------------------");
		mostrar(B);
		intercambiar(A,B,0 );
		
		
		
		
		/*PilaV A = new PilaV();
		A.llenar(Leer.datoInt());
		A.mostrar();*/
	}
	
	public static void contar(PilaV a, String x) {
		int c = 0;
		PilaV aux = new PilaV();
		while (!a.esvacia()) {
			Verdura v = a.eliminar();
			if (v.getColor().equals(x)) {
				c++;
			}
			aux.adicionar(v);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void cargar(Stack<Verdura> a, int n) {
		for (int i = 0; i < n; i++) {
			Verdura x = new Verdura();
			x.leer();
			a.push(x);
		}
	}
	public static void mostrar(Stack<Verdura> a) {
		Stack<Verdura> b = new Stack<Verdura>();
		while (!a.isEmpty()) {
			Verdura v = a.pop();
			v.mostrar();
			b.push(v);
		}
		vaciar(a,b);
	}
	public static void vaciar(Stack<Verdura> x, Stack<Verdura> y) {
		while (!y.isEmpty()) {
			x.push(y.pop());
		}
	}
	public static void contar(Stack<Verdura> a, int x) {
		int c = 0;
		Stack<Verdura> b = new Stack<Verdura>();
		while (!a.isEmpty()) {
			Verdura v = a.pop();
			if (v.getPrecio() == x) {
				c++;
			}
			b.push(v);
		}
		System.out.println("Cantidad de " + c);
		vaciar(a,b);
	}
	public static void intercambiar(Stack<Verdura > a, Stack<Verdura> b, int k) {
		Stack<Verdura> aa = new Stack<Verdura>();
		Stack<Verdura> bb = new Stack<Verdura>();
		if (a.size()>= k && b.size()>=k) {
			vaciar(aa,a);
			vaciar(bb, b);
			for (int i = 1; i <= k; i++) {
				b.push(aa.pop());
				a.push(bb.pop());
			}
			vaciar(a, aa);
			vaciar(b, bb);
			mostrar(a);
			mostrar(b);
		}
	}
}
