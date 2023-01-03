package brief_base_poo;

public class Triangle {
	private double lenAB;
	private double lenBC;
	private double lenCA;
	private int a;
	private int b;
	private int c;
	

	// Calcul du périmètre:
	public double perimeter() {
		return lenAB + lenBC + lenCA;
	}

	// Calcul de surface à partir des côtés (formule de Héron):
	public double surface() {
		return Math.sqrt(4 * Math.pow(lenAB, 2) * Math.pow(lenBC, 2) - Math.pow((Math.pow(lenAB, 2) + Math.pow(lenBC, 2) - Math.pow(lenCA, 2)), 2))/4;
	}
	
	// Déplacement du triangle de x:
	public void transpose(int number) {
		a += number;
		b += number;
		c += number;
		System.out.println("Le triangle a été déplacé de " + number);
	}

	// Réduction de chaque côté du triangle de x%:
	public void reduce(int number) {
		lenAB -= lenAB * 10 / 100;
		lenBC -= lenBC * 10 / 100;
		lenCA -= lenCA * 10 / 100;
		System.out.println("Le triangle a été réduit de " + number + "%");
	}

	//Getters/setters:
	
	public double getLenAB() {
		return lenAB;
	}

	public void setLenAB(double lenAB) {
		this.lenAB = lenAB;
	}

	public double getLenBC() {
		return lenBC;
	}

	public void setLenBC(double lenBC) {
		this.lenBC = lenBC;
	}

	public double getLenCA() {
		return lenCA;
	}

	public void setLenCA(double lenCA) {
		this.lenCA = lenCA;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}
