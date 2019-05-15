package unlam;

public class Triangulo {

	private int lad1;
	private int lad2;
	private int lad3;
	private boolean esTri;
	
	/**
	 * 
	 * @param lado - Ingresa la cantidad de lados que creas necesaria
	 */
	public Triangulo(int... lado) {
		
		if(lado.length != 3 || !esTriangulo(lado[0], lado[1], lado[2]))
			this.esTri = false;
		else {
			this.esTri = true;
			this.lad1 = lado[0];
			this.lad2 = lado[1];
			this.lad3 = lado[2];
		}
	};
	
	public int getLad1() {
		return lad1;
	}

	public void setLad1(int lad1) {
		this.lad1 = lad1;
	}

	public int getLad2() {
		return lad2;
	}

	public void setLad2(int lad2) {
		this.lad2 = lad2;
	}

	public int getLad3() {
		return lad3;
	}

	public void setLad3(int lad3) {
		this.lad3 = lad3;
	}
		
	public boolean esTriangulo() {
		//Veo que sean todos positivos
		if(this.lad1<=0 || this.lad2<=0 || this.lad3<=0)
			return false;
		
		int res1=this.lad1+this.lad2;
		int res2=this.lad2+this.lad3;
		int res3=this.lad3+this.lad1;
		
		if(res1<=this.lad3 || res2<=this.lad1 || res3<=this.lad2) {
			return false;
		}
		
		return true;
	}
	
	private static boolean esTriangulo(int a, int b, int c) {
		//Veo que sean todos positivos
		if(a<=0 || b<=0 || c<=0)
			return false;
		
		int res1=a+b;
		int res2=b+c;
		int res3=c+a;
		
		if(res1<=c|| res2<=a || res3<=b) {
			return false;
		}
		
		return true;
	}
	
	public String tipoTriangulo() {
		if(!this.esTri)
			return "No es un triangulo";
		
		if(this.lad1==this.lad2 && this.lad2==this.lad3) {
			return "Equilatero";
		} 
		else {
			if(this.lad1!=this.lad2 && this.lad2!=this.lad3 && this.lad1!=this.lad3 ) {
				return "Escaleno";
			} 
			else {
				return "Isosceles";
			}
		}		
	}
}
