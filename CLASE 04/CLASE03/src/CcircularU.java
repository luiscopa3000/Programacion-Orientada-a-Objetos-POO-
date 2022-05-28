
public class CcircularU {
	private int max = 100;
	private int ini;
	private int fin;
	private UsoMaterial p[] = new UsoMaterial[max +1];
	public CcircularU() {
	}

    int nroelem ()
    {
    	return ((max + fin - ini) % max);
    }


    boolean esvacia ()
    {
    	if (nroelem () == 0) {
    		return (true);
    	}else {
        	return (false);
		}
    }


    boolean esllena ()
    {
    	if (nroelem () == max - 1) {
    		return (true);
    	}else {
        	return (false);
		}
    }


    void adicionar (UsoMaterial elem)
    {
    	if (!esllena ())
    	{

    		fin = (fin + 1) % max;
    		p [fin] = elem;
    	}
    	else
    		System.out.println ("Cola circular llena");
    }


    UsoMaterial eliminar ()
    {
    	UsoMaterial elem = new UsoMaterial ();
    	if (!esvacia ())
    	{
    		ini = (ini + 1) % max;
    		elem = p [ini];
    		if (nroelem () == 0)
    			ini = fin = 0;
    	}
    	else
    		System.out.println ("Cola circular vacia");
    	return (elem);
    }


    void mostrar ()
    {
    	UsoMaterial elem;
    	if (esvacia ())
    		System.out.println ("Cola vacia xxx");
    	else
    	{
    		System.out.println ("\n Datos de la Cola ");
    		CcircularU aux = new CcircularU ();
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
    		UsoMaterial elem = new UsoMaterial ();
    		elem.leer ();
    		adicionar (elem);
    	}
    }
    void vaciar (CcircularU a)
    {
    	while (!a.esvacia ())
    		adicionar (a.eliminar ());

    }
}
