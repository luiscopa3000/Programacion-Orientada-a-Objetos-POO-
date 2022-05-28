
public class NodoSta {
	private Empresa e;
	private LDoblePer a;
	private LSimplePro b;
	private NodoSta ant, sig;
	public NodoSta() {
		ant = sig = null;
	}
	public Empresa getE() {
		return e;
	}
	public void setE(Empresa e) {
		this.e = e;
	}
	public LDoblePer getA() {
		return a;
	}
	public void setA(LDoblePer a) {
		this.a = a;
	}
	public LSimplePro getB() {
		return b;
	}
	public void setB(LSimplePro b) {
		this.b = b;
	}
	public NodoSta getAnt() {
		return ant;
	}
	public void setAnt(NodoSta ant) {
		this.ant = ant;
	}
	public NodoSta getSig() {
		return sig;
	}
	public void setSig(NodoSta sig) {
		this.sig = sig;
	}
	
}
