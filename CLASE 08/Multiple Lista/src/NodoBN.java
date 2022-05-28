
public class NodoBN {
	private String color;
	private int nivel;
	private LDobleSta c;
	NodoBN sig;
	public NodoBN() {
		sig = null;
	}
	public NodoBN(String color, int nivel, LDobleSta c, NodoBN sig) {
		super();
		this.color = color;
		this.nivel = nivel;
		this.c = c;
		this.sig = sig;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public LDobleSta getC() {
		return c;
	}
	public void setC(LDobleSta c) {
		this.c = c;
	}
	public NodoBN getSig() {
		return sig;
	}
	public void setSig(NodoBN sig) {
		this.sig = sig;
	}
	
}
