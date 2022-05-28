
public class Main {

	public static void main(String[] args) {
		LDoblePer per = new LDoblePer();
		per.adifinal("Juan", "Gerente");
		per.adifinal("Maria", "Sub gerente");
		per.adifinal("CArlos", "Guardia");
		per.adifinal("Mario", "Ventas");
		per.adifinal("Adrian", "Supervisor");
		
		LSimplePro pro = new LSimplePro();
		pro.adiprincipio("Jaron", "Ceramica", 1990, "Envio estandar");
		pro.adiprincipio("Pintura", "artesania", 731, "Envio Contra reembolso");
		pro.adiprincipio("Aretes", "Joyeria", 6652, "Envio fragil");
		pro.adiprincipio("Ropero", "Muebleria", 324, "Envio pesado");
		pro.adiprincipio("Flores", "Decoracion", 5321, "Envio estandar");
		
		Empresa el = new Empresa("Soboce", "mediana", "nacinal");
		
		//*********************************************************
		LDoblePer per1 = new LDoblePer();
		per1.adifinal("Juan11", "Gerente11");
		per1.adifinal("Maria11", "Sub gerente11");
		per1.adifinal("CArlos11", "Guardia11");
		per1.adifinal("Mario11", "Ventas11");
		per1.adifinal("Adrian11", "Supervisor11");
		
		LSimplePro pro1 = new LSimplePro();
		pro1.adiprincipio("Jaron11", "Ceramica11", 1990, "Envio estandar");
		pro1.adiprincipio("Pintura11", "artesania11", 731, "Envio Contra reembolso");
		pro1.adiprincipio("Aretes11", "Joyeria11", 6652, "Envio fragil");
		pro1.adiprincipio("Ropero11", "Muebleria11", 324, "Envio pesado");
		pro1.adiprincipio("Flores11", "Decoracion11", 5321, "Envio estandar");
		
		Empresa e2 = new Empresa("ABC", "mediana", "nacinal");
		
		
		//***********************************************************

		LDoblePer per2 = new LDoblePer();
		per2.adifinal("Carla22", "Gerente22");
		per2.adifinal("Jorge22", "Sub gerente22");
		per2.adifinal("Roger22", "Guardia22");
		per2.adifinal("Cesar22", "Ventas22");
		per2.adifinal("Adriana22", "Supervisor22");

		LSimplePro pro2 = new LSimplePro();
		pro2.adiprincipio("Jaron22", "Ceramica22", 1990, "Envio estandar");
		pro2.adiprincipio("Pintura22", "artesania22", 731, "Envio Contra reembolso");
		pro2.adiprincipio("Aretes22", "Joyeria22", 6652, "Envio fragil");
		pro2.adiprincipio("Ropero22", "Muebleria22", 324, "Envio pesado");
		pro2.adiprincipio("Flores22", "Decoracion22", 5321, "Envio estandar");
		
		Empresa e3 = new Empresa("Entel", "Grande", "Internacionl");
		
		LDobleSta s1 = new LDobleSta();
		s1.adifinal(el, pro, per);
		s1.adifinal(e2, pro1, per1);
		s1.adifinal(e3, pro2, per2);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		LDoblePer per11 = new LDoblePer();
		per11.adifinal("Juan33", "Gerente33");
		per11.adifinal("Maria33", "Sub gerente33");
		per11.adifinal("CArlos33", "Guardia33");
		per11.adifinal("Mario33", "Ventas33");
		per11.adifinal("Adrian33", "Supervisor33");
		
		LSimplePro pro11 = new LSimplePro();
		pro11.adiprincipio("Jaron33", "Ceramica33", 1990, "Envio estandar");
		pro11.adiprincipio("Pintura33", "artesania33", 731, "Envio Contra reembolso");
		pro11.adiprincipio("Aretes33", "Joyeria33", 6652, "Envio fragil");
		pro11.adiprincipio("Ropero33", "Muebleria33", 324, "Envio pesado");
		pro11.adiprincipio("Flores33", "Decoracion33", 5321, "Envio estandar");
		
		Empresa el2 = new Empresa("AAIB", "mediana", "nacinal");
		
		//*********************************************************
		LDoblePer per12 = new LDoblePer();
		per12.adifinal("Juan44", "Gerente44");
		per12.adifinal("Maria44", "Sub gerente44");
		per12.adifinal("CArlos44", "Guardia44");
		per12.adifinal("Mario44", "Ventas44");
		per12.adifinal("Adrian44", "Supervisor44");
		
		LSimplePro pro12 = new LSimplePro();
		pro12.adiprincipio("Jaron44", "Ceramica44", 1990, "Envio estandar");
		pro12.adiprincipio("Pintura44", "artesania44", 731, "Envio Contra reembolso");
		pro12.adiprincipio("Aretes44", "Joyeria44", 6652, "Envio fragil");
		pro12.adiprincipio("Ropero44", "Muebleria44", 324, "Envio pesado");
		pro12.adiprincipio("Flores44", "Decoracion44", 5321, "Envio estandar");
		
		Empresa e13 = new Empresa("AVÍCOLA ROLÓN", "mediana", "nacinal");
		
		
		//***********************************************************

		LDoblePer per22 = new LDoblePer();
		per22.adifinal("Carla55", "Gerente55");
		per22.adifinal("Jorge55", "Sub gerente55");
		per22.adifinal("Roger55", "Guardia55");
		per22.adifinal("Cesar55", "Ventas55");
		per22.adifinal("Adriana5", "Supervisor55");

		LSimplePro pro22 = new LSimplePro();
		pro22.adiprincipio("Jaron55", "Ceramica55", 1990, "Envio estandar");
		pro22.adiprincipio("Pintura55", "artesania55", 731, "Envio Contra reembolso");
		pro22.adiprincipio("Aretes55", "Joyeria55", 6652, "Envio fragil");
		pro22.adiprincipio("Ropero55", "Muebleria55", 324, "Envio pesado");
		pro22.adiprincipio("Flores55", "Decoracion55", 5321, "Envio estandar");
		
		Empresa e23 = new Empresa("ALMANZA CORP", "Grande", "Internacionl");

		
		
		
		LDobleSta s2 = new LDobleSta();
		s2.adifinal(el2, pro11, per11);
		s2.adifinal(e13, pro12, per12);
		s2.adifinal(e23, pro22, per22);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		LDoblePer per23 = new LDoblePer();
		per23.adifinal("Juan66", "Gerente66");
		per23.adifinal("Maria66", "Sub gerente66");
		per23.adifinal("CArlos66", "Guardia66");
		per23.adifinal("Mario66", "Ventas66");
		per23.adifinal("Adrian66", "Supervisor66");
		
		LSimplePro pro23 = new LSimplePro();
		pro23.adiprincipio("Jaron66", "Ceramica66", 1990, "Envio estandar");
		pro23.adiprincipio("Pintura66", "artesania66", 731, "Envio Contra reembolso");
		pro23.adiprincipio("Aretes66", "Joyeria66", 6652, "Envio fragil");
		pro23.adiprincipio("Ropero66", "Muebleria66", 324, "Envio pesado");
		pro23.adiprincipio("Flores66", "Decoracion66", 5321, "Envio estandar");
		
		Empresa e230 = new Empresa("ANDES TRÓPICO", "mediana", "nacinal");
		
		//*********************************************************
		LDoblePer per24 = new LDoblePer();
		per24.adifinal("Juan77", "Gerente");
		per24.adifinal("Maria77", "Sub gerente77");
		per24.adifinal("CArlos77", "Guardia77");
		per24.adifinal("Mario77", "Ventas77");
		per24.adifinal("Adrian77", "Supervisor77");
		
		LSimplePro pro24 = new LSimplePro();
		pro24.adiprincipio("Jaron77", "Ceramica77", 1990, "Envio estandar");
		pro24.adiprincipio("Pintura77", "artesania77", 731, "Envio Contra reembolso");
		pro24.adiprincipio("Aretes77", "Joyeria77", 6652, "Envio fragil");
		pro24.adiprincipio("Ropero77", "Muebleria77", 324, "Envio pesado");
		pro24.adiprincipio("Flores77", "Decoracion77", 5321, "Envio estandar");
		
		Empresa e24 = new Empresa("BOLPEGAS", "mediana", "nacinal");
		
		
		//***********************************************************

		LDoblePer per25 = new LDoblePer();
		per25.adifinal("Carla88", "Gerente");
		per25.adifinal("Jorge88", "Sub gerente88");
		per25.adifinal("Roger88", "Guardia88");
		per25.adifinal("Cesar88", "Ventas88");
		per25.adifinal("Adriana88", "Supervisor88");

		LSimplePro pro25 = new LSimplePro();
		pro25.adiprincipio("Jaron88", "Ceramica88", 1990, "Envio estandar");
		pro25.adiprincipio("Pintura88", "artesania88", 731, "Envio Contra reembolso");
		pro25.adiprincipio("Aretes88", "Joyeria88", 6652, "Envio fragil");
		pro25.adiprincipio("Ropero88", "Muebleria88", 324, "Envio pesado");
		pro25.adiprincipio("Flores88", "Decoracion88", 5321, "Envio estandar");
		
		Empresa e25 = new Empresa("BEBIDAS S.A.", "Grande", "Internacionl");
		
		LDobleSta s3 = new LDobleSta();
		s3.adifinal(e230, pro23, per23);
		s3.adifinal(e24, pro24, per24);
		s3.adifinal(e25, pro25, per25);
		
		
		
		
		
		LSimpleBN d = new LSimpleBN();
		d.adiprincipio("Rojo", 2, s1);
		d.adiprincipio("Amarillo", 2, s2);
		d.adiprincipio("verda", 1, s3);
		//d.mostrar();
		//De la empresa x mostrar sus productos.
		/*System.out.println("\n//////////////////////////BUSCA//////////////////////////");
		busca(d, "abc");*/
		
		
		System.out.println("Introduzca el color x");
		String colorx = Leer.dato();
		System.out.println("Introduzca el nombre del producto");
		String prx = Leer.dato();
		ColorX(d, colorx, prx);
		System.out.println("Introduzca el cargo");
		String cargox = Leer.dato();
		prob2(d, cargox);
		
		
		System.out.println("Introduzca el nivel");
		int nivx = Leer.datoInt();
		prob3(d, nivx);
		
		d.mostrar();
		
		
	}
	public static void ColorX(LSimpleBN a, String x ,String xp) {
		NodoBN nue = a.getP();
		while (nue != null) {
			boolean sw = false;
			if (nue.getColor().equals(x)) {
				NodoSta sta = nue.getC().getP();
				while (sta != null) {
					NodoPro pro = sta.getB().getP();
					while (pro != null) {
						if (pro.getNombre().equals(xp)) {
							sw = true;
						}
						pro = pro.getSig();
					}
					if (sw) {
						sta.getE().mostrar();
						System.out.println("_________________PRODUCTOS______________");
						sta.getB().mostrar();
						System.out.println("_________________PERSONAL________________");
						sta.getA().mostrar();
					}
					sta = sta.getSig();
				}
			}
			if (sw) {
				System.out.println("---------------[Nivel: " + nue.getNivel()+"]-------------------");
				
			}
			nue = nue.getSig();
		}
	}
	public static void prob2(LSimpleBN a, String x) {
		NodoBN nue = a.getP();
		while (nue != null) {
			System.out.println("BLOQUE: "+nue.getColor() +" NIVEL: " + nue.getNivel());
			int cont = 0;
			NodoSta sta = nue.getC().getP();
			while (sta != null) {
				boolean sw = false;
				NodoPer per = sta.getA().getP();
				while (per != null) {
					if (per.getCargo().equals(x) ) {
						sw = true;
					}
					per = per.getSig();
				}
				if (sw) {
					cont++;
				}
				sta = sta.getSig();
			}
			System.out.println("Cantidad de stands: "+ cont);
			nue = nue.getSig();
		}
		
	}

	//GRUPO B
	//c)	Agregar un nuevo personal después de LA primer PERSONA, a todas las Empresas del nivel X de todos los bloques.
		
	public static void prob3(LSimpleBN a, int x) {
		NodoBN nue = a.getP();
		while (nue != null) {

			if (nue.getNivel() == x) {
				NodoSta sta = nue.getC().getP();
				while (sta != null) {
					NodoPer per = sta.getA().getP();
					System.out.println("Introduzca el nombre:");
					String nombre = Leer.dato();
					System.out.println("Introduzca el cargo");
					String cargo = Leer.dato();
					NodoPer pp = new NodoPer();
					pp.setCargo(cargo);
					pp.setNombre(nombre);
					pp.setAnt(per);
					pp.setSig(per.getSig());
					
					per.getSig().setAnt(pp);
					per.setSig(pp);
					sta = sta.getSig();
				}
				
			}
			nue = nue.getSig();
		}
	}
	
	
	
	
	
	public static void busca(LSimpleBN a, String x) {
		NodoBN r1 = a.getP();
		while (r1 != null) {
			NodoSta r2 = r1.getC().getP();
			while (r2 != null) {
				if (r2.getE().getNombre().equals(x)) {
					System.out.println("Nivel: " + r1.getColor()+" " + r1.getNivel());
					r2.getB().mostrar();
				}
				r2 = r2.getSig();
			}
			
			r1 = r1.getSig();
		}
		
	}
	
	
	
}
