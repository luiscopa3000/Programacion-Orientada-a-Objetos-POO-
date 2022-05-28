
public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		/*Zona B = new Zona();
		B.leer();
		B.mostrar();
		
		PilaZ C = new PilaZ();
		C.llenar(Leer.datoInt());
		C.mostrar();*/
		Contenedor c1  = new Contenedor("amarillo", "a", 4);
		Contenedor c2  = new Contenedor("b", "b", 2);
		Contenedor c3  = new Contenedor("c", "c", 3);
		Contenedor c4  = new Contenedor("d", "d", 1);
		Contenedor c5  = new Contenedor("e", "e", 1);
		CCircularC cc1 = new CCircularC();
		cc1.adicionar(c1);
		cc1.adicionar(c2);
		CCircularC cc2 =new CCircularC();
		cc2.adicionar(c3);
		cc2.adicionar(c4);
		CCircularC cc3 = new CCircularC();
		cc3.adicionar(c5);
		cc3.adicionar(c1);
		cc3.adicionar(c3);
		Zona z1 = new Zona();
		z1.setNomZona("sopocachi");
		z1.setCc(cc1);
		Zona z2 = new Zona();
		z2.setNomZona("miraflores");
		z2.setCc(cc2);
		Zona z3 = new Zona();
		z3.setNomZona("San Pedro");
		z3.setCc(cc3);
		MultiPZ D = new MultiPZ();
		D.adicionar(1, z1);
		D.adicionar(2, z2);
		D.adicionar(2, z3);
		D.setNc(2);
		D.mostrar();
		//Determinar la cantidad total de contenedores de color amarillo
		
		
		total(D);
	}
	public static void total(MultiPZ a) {
		PilaZ aux = new PilaZ();
		int c = 0;
		for (int i = 1; i <= a.getNc(); i++) {
			while (!a.esvacia(i)) {
				Zona zx = a.eliminar(i);
				aux.adicionar(zx);
				CCircularC con = zx.getCc();
				while (!con.esvacia()) {
					Contenedor w = con.eliminar();
					if (w.getColor().equals("amarillo")) {
						c++;
					}
				}
			}
			a.vaciar(i, aux);
		}
		System.out.println("Total amarillos: " + c);
		
		
	}

}
