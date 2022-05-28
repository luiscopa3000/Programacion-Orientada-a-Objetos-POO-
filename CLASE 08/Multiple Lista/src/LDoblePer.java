
public class LDoblePer {
	private NodoPer p;
	public void adifinal(String nombre, String cargo) {
		NodoPer nue = new NodoPer();
		nue.setNombre(nombre);
		nue.setCargo(cargo);
		
		if (getP() == null) {
			setP(nue);
		}else {
			NodoPer u = getP();
			while (u.getSig()!= null) {
				u = u.getSig();
			}
			u.setSig(nue);
			nue.setAnt(u);
		}
	}
	public void mostrar() {
		NodoPer f = getP();
		while (f!= null) {
			System.out.println(" ["+f.getNombre() + " | "+f.getCargo()+ "]");
			f=f.getSig();
		}
	}
	public LDoblePer() {
		p = null;
	}
	public NodoPer getP() {
		return p;
	}
	public void setP(NodoPer p) {
		this.p = p;
	}
}
