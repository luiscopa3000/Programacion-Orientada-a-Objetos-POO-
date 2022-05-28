
public class LSimpleR {
	private NodoR p;
	public LSimpleR() {
		p = null;
	}
	public NodoR getP() {
		return p;
	}
	public void setP(NodoR p) {
		this.p = p;
	}
	public void adiprincipio(int a, String b) {
		NodoR nue = new NodoR();
		nue.setIdRuta(a);
		nue.setNombre(b);
		
		nue.setSig(getP());
		setP(nue);
	}
	public void mostrar() {
		NodoR c = getP();
		while (c!= null) {
			System.out.println("["+c.getIdRuta()+"|"+c.getNombre()+"] ");
			c = c.getSig();
		}
	}
	
}
