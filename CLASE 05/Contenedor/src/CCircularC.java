
public class CCircularC {

	int max = 50;
    int ini, fin;
    Contenedor v[] = new Contenedor[100];
    CCircularC ()
    {
	ini = fin = 0;
    }

    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }


    boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }


    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }


    void adicionar (Contenedor elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }


    Contenedor eliminar ()
    {
	Contenedor elem = new Contenedor();
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }


    void mostrar ()
    {
	Contenedor elem;
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Datos de la Cola ");
	    CCircularC aux = new CCircularC();
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
	    Contenedor elem = new Contenedor();
	    elem.leer ();
	    adicionar (elem);
	}
    }
    void vaciar (CCircularC a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }
}
