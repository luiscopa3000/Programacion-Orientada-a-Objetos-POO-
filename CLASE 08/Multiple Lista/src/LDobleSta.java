
public class LDobleSta {
	private NodoSta p;
	
	public void adifinal(Empresa a, LSimplePro b, LDoblePer c) {
		NodoSta nue = new NodoSta();
		nue.setE(a);
		nue.setB(b);
		nue.setA(c);
		
		if (getP() == null) {
			setP(nue);
		}else {
			NodoSta u = getP();
			while (u.getSig()!= null) {
				u = u.getSig();
			}
			u.setSig(nue);
			nue.setAnt(u);
		}
	}
	void mostrar()
    {
        NodoSta r=getP();
        while(r!=null)
        {
            r.getE().mostrar();
            r.getA().mostrar();
            r.getB().mostrar();
            r=r.getSig();
        }
    }
	public LDobleSta() {
		p = null;
	}
	public NodoSta getP() {
		return p;
	}
	public void setP(NodoSta p) {
		this.p = p;
	}
	
}
