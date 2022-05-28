
public class PilaV {
	private int max = 40;
	private Verdura v[] = new Verdura[max-1];
	private int tope;
	
	PilaV()
    {
        tope=0;
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
    void adicionar (Verdura elem)
    {
    	if (!esllena ())
    	{
    		tope++;
    		v [tope] = elem;
    	}
    	else
	    System.out.println ("Pila llena");
    }
    Verdura eliminar ()
    {
    	Verdura elem = new Verdura ();
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
    	Verdura elem;
    	if (esvacia ())
    		System.out.println ("Pila vacia");
    	else
    	{
    		System.out.println ("\n Datos de la Pila ");
    		PilaV aux = new PilaV ();
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
    		Verdura l = new Verdura ();
    		l.leer ();
    		adicionar (l);
    	}
    }
    void vaciar (PilaV a)
    {
    	while (!a.esvacia ())
    		adicionar (a.eliminar ());

    }


}
