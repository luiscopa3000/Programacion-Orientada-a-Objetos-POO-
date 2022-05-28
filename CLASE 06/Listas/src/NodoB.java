
public class NodoB {
	private Bus a;
	private NodoB sig;
	public NodoB() {
		sig = null;
	}
	public Bus getA() {
		return a;
	}
	public void setA(Bus a) {
		this.a = a;
	}
	public NodoB getSig() {
		return sig;
	}
	public void setSig(NodoB sig) {
		this.sig = sig;
	}
	
}
