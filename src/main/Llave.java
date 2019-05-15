package main;

public class Llave {
	
	private int nroLinea;
	private String llave;
	
	public Llave(int nroLinea, String llave) {
		this.nroLinea = nroLinea;
		this.llave = llave;
	}

	public int getNroLinea() {
		return nroLinea;
	}

	public String getLlave() {
		return llave;
	}
	
	@Override
	public String toString() {
		return this.llave;
	}
}
