package Ejercico;


import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a= new Vector();
        Vector z= new Vector();
        llenar(a);
        System.out.println(a+" "+a.firstElement()+" "+a.lastElement()+" "+a.size());
        a.add(1, "xxx");
        System.out.println(a);
        llenar(z);
        System.out.println(z);
	}
	
	
	
	public static void llenar(Vector v)
    {
        int k=Leer.datoInt();
        for(int i=1;i<=k;i++)
            v.addElement(Leer.dato());
    }

}
