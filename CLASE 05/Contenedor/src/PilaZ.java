
public class PilaZ {
	private int max=50;
	private Zona v[]= new Zona[max+1];
	private int tope;
	public PilaZ() {
		tope = 0;
	}

	boolean esvacia ()
	   {
		if (tope == 0)
		    return (true);
		return (false);
	    }

	    boolean esllena ()
	    {
		if (tope == max)
		    return (true);
		return (false);
	    }


	    int nroelem ()
	    {
		return (tope);
	    }


	    void adicionar (Zona elem)
	    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
	    }


	    Zona eliminar ()
	    {
		Zona elem = new Zona ();
		if (!esvacia ())
		{
		    elem = v [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
	    }


	    void mostrar ()
	    {
		Zona elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else
		{
		    System.out.println ("\n Datos de la Pila ");
		    PilaZ aux = new PilaZ ();
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


	    void llenar (int n)
	    {
		int i;

		for (i = 1 ; i <= n ; i++)
		{
		    Zona l = new Zona ();
		    l.leer();
		    adicionar (l);
		}
	    }


	    void invertir ()
	    {
		PilaZ a = new PilaZ ();
		PilaZ b = new PilaZ ();
		while (!esvacia ())
		    a.adicionar (eliminar ());
		while (!a.esvacia ())
		    b.adicionar (a.eliminar ());
		while (!b.esvacia ())
		    adicionar (b.eliminar ());
	    }


	    void vaciar (PilaZ a)
	    {
		while (!a.esvacia ())
		    adicionar (a.eliminar ());

	    }
}
