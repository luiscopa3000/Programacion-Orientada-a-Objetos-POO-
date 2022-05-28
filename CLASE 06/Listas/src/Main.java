
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSimpleR A = new LSimpleR();
		A.adiprincipio(1, "Villa salome");
		A.adiprincipio(2, "Chasquipampa");
		A.adiprincipio(3, "Llojeta");
		A.adiprincipio(4, "Irpavi");
		System.out.println("------------LSITA DE RUTAS----------------");
		A.mostrar();
		System.out.println("\n-----------LISTA OBJETOS PERDIDOS-----------");
		LSimpleO O = new LSimpleO();
		O.adiprincipio("FECHA 1", "Paraguas", "DESCRICPION 1", 1);
		O.adiprincipio("FECHA 2", "Reloj   ", "DESCRICPION 2", 2);
		O.adiprincipio("FECHA 3", "Celular ", "DESCRICPION 3", 1);
		O.adiprincipio("FECHA 4", "Mochila ", "DESCRICPION 4", 3);
		O.adiprincipio("FECHA 5", "Cartera ", "DESCRICPION 5", 1);
		
		O.mostrar();
		System.out.println("\n-----------LISTA DE BUSES--------");
		LSImpleB B = new LSImpleB();
		Bus b1 = new Bus(1, 1, "juan", "Puma");
		Bus b2 = new Bus(2, 3, "ana", "Puma");
		Bus b3 = new Bus(3, 2, "jluis", "chiki");
		Bus b4 = new Bus(4, 4, "maria", "Puma");
		Bus b5 = new Bus(5, 1, "jorge", "chiki");
		B.adifinal(b1);
		B.adifinal(b2);
		B.adifinal(b3);
		B.adifinal(b4);
		B.adifinal(b5);
		B.mostrar();
		
		
		//Mostrar de cada ruta sus buses 
		System.out.println("\n");
		//eje1(A, B);
		//Mostrar los buses que tienen objetos perdidos y contar esos objetos
		//eje2(B, O);
		eje3(A, B, O);
		
	}

	
	
	//De cada ruta determinar la cantidad total de objetos perdidos.
	
	public static void eje3(LSimpleR a, LSImpleB b, LSimpleO c) {
		NodoR rut = a.getP();
		while (rut != null) {
			System.out.println("RUTA: " + rut.getNombre());
			int cont = 0;
			NodoB bus= b.getP();
			while (bus != null) {
				NodoO obj = c.getP();
				if (rut.getIdRuta() == bus.getA().getIdRuta()) {
					while (obj != null) {
						if (bus.getA().getIdBus() == obj.getIdBus()) {
							cont++;
						}
						obj = obj.getSig();
					}
					
				}
				bus = bus.getSig();
			}
			rut = rut.getSig();
			System.out.println(cont);
		}
	}
	
	public static void eje2(LSImpleB a, LSimpleO b)
    {
        NodoB r=a.getP();
        while(r!=null)
        {
            int c=0;
            NodoO q=b.getP();
            while(q!=null)
            {
                if(r.getA().getIdBus()==q.getIdBus())
                    c++;
                q=q.getSig();
            }
            if(c>0)
                System.out.println("\n"+r.getA().getIdBus()+" "+r.getA().getConductor()+"--> "+c);
            r=r.getSig();
        }
    }
	public static void eje1(LSimpleR a, LSImpleB b) {
		NodoR w = a.getP();
		while (w != null) {
			System.out.println("RUTA: " + w.getNombre());
			NodoB z = b.getP();
			while (z != null) {
				z= z.getSig();
				if (z.getA().getIdRuta() == w.getIdRuta())
					z.getA().mostrar();
			}
			w = w.getSig();
			
		}
		
	}
}
