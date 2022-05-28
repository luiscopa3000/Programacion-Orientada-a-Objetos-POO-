
public class LSImpleB {
	private NodoB p;
	public LSImpleB() {
		p = null;
	}
	public NodoB getP() {
		return p;
	}
	public void setP(NodoB p) {
		this.p = p;
	}
	public void adifinal(Bus x) {
		NodoB nue = new NodoB();
		nue.setA(x);
		
		if (getP() == null) {
			setP(nue);
		}else {
			NodoB m = getP();
			while (m.getSig() != null)
				m = m.getSig();
			m.setSig(nue);
		}
	}
	public void mostrar()
    {
        NodoB c=getP();
        while(c!=null)
        {
            c.getA().mostrar();
            c=c.getSig();
        }
    }
}
