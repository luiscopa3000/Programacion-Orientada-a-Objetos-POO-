
public class LSimpleO {
	//Lista Simple ObjPerdidos<fecha, nombre, descripcion, idBus> datos
	private NodoO p;
	public LSimpleO() {
		p = null;
	}
	public NodoO getP() {
		return p;
	}
	public void setP(NodoO p) {
		this.p = p;
	}
	public void adiprincipio(String fecha, String nombre, String descricpion, int idBus) {
		NodoO nue = new NodoO();
		nue.setNombre(nombre);
		nue.setFecha(fecha);
		nue.setDescripcion(descricpion);
		nue.setIdBus(idBus);
		nue.setSig(getP());
		setP(nue);
	}
	public void mostrar() {
		NodoO c = getP();
		while (c!= null) {
			System.out.println("["+c.getNombre()+"|"+c.getFecha()+" "+c.getDescripcion()+" "+ c.getIdBus()+"]");
			c = c.getSig();
		}
	}
}
