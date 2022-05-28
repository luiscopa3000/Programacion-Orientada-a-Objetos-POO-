
public class LSimpleBN {
	private NodoBN p;
	public LSimpleBN() {
		p = null;
	}
	public NodoBN getP() {
		return p;
	}
	public void setP(NodoBN p) {
		this.p = p;
	}
	public void adiprincipio(String color, int nivel, LDobleSta c) {
		NodoBN nue = new NodoBN();
		nue.setColor(color);
		nue.setNivel(nivel);
		nue.setC(c);
		nue.setSig(getP());
		setP(nue);
	}
	public void mostrar() {
		NodoBN c = getP();
		while (c!= null) {
			System.out.println("\n----------------["+c.getColor()+"|"+c.getNivel()+"]---------------------");
			c.getC().mostrar();
			c = c.getSig();
		}
	}
	

}
