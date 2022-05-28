
public class MultiPZ {
	private int nc;
	private PilaZ c[] = new PilaZ[12];
	public MultiPZ() {
		for (int i = 1; i <=11; i++) {
			c[i]= new PilaZ();
		}
	}
	
	public MultiPZ(int nc, PilaZ[] c) {
		super();
		this.nc = nc;
		this.c = c;
	}

	int NroPilas ()
    {
		return (nc);
    }
	int nroelem(int i)
	{
		return (c[i].nroelem());
	}

    boolean esvacia (int i)
    {
	  return (c [i].esvacia ());
	    
    }


    boolean esllena (int i)
    {
	 return  (c [i].esllena ());
	    
    }


    void adicionar (int i, Zona L)
    {
    	if (!c [i].esllena ()) {
    		c [i].adicionar (L);
    	}
    	else
    		System.out.print ("Pila " + i + " esta llena");
    }


    Zona eliminar (int i)
    {
	Zona  e = new Zona();
	if (!c[i].esvacia ())
	    e = c [i].eliminar ();
	else
	    System.out.print ("Pila " + i + " esta vacia");
	return e;
    }


    void llenar(int i, int n)
    {
		c[i].llenar(n);
    }
    
    void llenar (int n)
    {
	int i, m;

	nc = n;
	for (i = 1 ; i <= n ; i++)
	{
	    System.out.print ("\nNro. elementos Pila " + i + " :");
	    m = Leer.datoInt ();
	    c [i].llenar (m);
	}
    }


    void mostrar(int i)
    {
    	c[i].mostrar();
    }
    
    void mostrar ()
    {
    	int i;
    	for (i = 1 ; i <= nc ; i++)
    	{
    		System.out.println ("\n\nDatos Pila " + i + " ");
    		c [i].mostrar ();
    	}
    }
    void vaciar(int i, PilaZ z)
    {
    	c[i].vaciar(z);
    }
    void vaciar (int i, int j)
    {
    	c[i].vaciar(c[j]);
    }

    
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
}
