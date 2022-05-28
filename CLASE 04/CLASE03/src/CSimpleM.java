
public class CSimpleM {
	private int max = 100;
	private int ini;
	private int fin;
	private Material p[] = new Material[max +1];
	public CSimpleM() {
		ini = fin =0;
	}
    public boolean esvacia ()
    {
    	if (ini == 0 && fin == 0)
    	{
    	    return (true);
    	}
    	else 
    	{
    		return (false);
		}
    }


    public boolean esllena ()
    {
    	if (fin == max) {
    	    return (true);
    	} else {
    		return (false);
		}
    }
    public int nroelem ()
    {
    	return (fin - ini);
    }
    public void adicionar (Material elem)
    {
    	if (!esllena ())
    	{
    		fin++;
    		p [fin] = elem;
    	}
    	else {
    	    System.out.println ("Cola Simple llena");
    	}
    }
    public Material eliminar ()
    {
    	Material elem = new Material();
    	if (!esvacia ())
    	{
    		ini++;
    		elem = p [ini];
    		if (ini == fin) {
    			ini = fin = 0;
    		}
    	}
    	else {
    	    System.out.println ("Cola Simple vacia");
    	}
    	return (elem);
    }
    public void mostrar ()
    {
    	Material elem;
    	if (esvacia ()) {
    	    System.out.println ("Cola vacia");
    	}
    	else
    	{
    		System.out.println ("\n Datos de la Cola ");
    		CSimpleM aux = new CSimpleM();
    		while (!esvacia ())
    		{
    			elem = eliminar ();
    			aux.adicionar (elem);
    			elem.mostrar();
    		}
    		while (!aux.esvacia ())
    		{
    			elem = aux.eliminar ();

    			adicionar (elem);
    		}
    	}
    }
    public void llenar (int n)
    {
    	int i;
    	for (i = 1 ; i <= n ; i++) {
        	Material aux = new Material();
        	aux.leer();
        	adicionar(aux);
    	}
    }
    public void vaciar (CSimpleM a)
    {
    	while (!a.esvacia ()) {
    		adicionar (a.eliminar ());
    	}

    }
}
