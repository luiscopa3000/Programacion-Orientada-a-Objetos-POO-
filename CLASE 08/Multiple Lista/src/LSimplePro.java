
public class LSimplePro {
	private NodoPro p;
	public LSimplePro() {
		p = null;
	}

	public void adiprincipio(String nombre, String tipo, int precio, String entrega) {
		NodoPro nue = new NodoPro();
		nue.setNombre(nombre);
		nue.setTipo(tipo);
		nue.setPrecio(precio);
		nue.setEntrega(entrega);
		nue.setSig(getP());
		setP(nue);
	}
	public void mostrar() {
		NodoPro c = getP();
		while (c!= null) {
			System.out.println("["+c.getNombre()+"|"+c.getTipo()+" | "+c.getPrecio()+" | "+ c.getEntrega()+"]");
			c = c.getSig();
		}
	}

	public NodoPro getP() {
		return p;
	}

	public void setP(NodoPro p) {
		this.p = p;
	}
	
}
