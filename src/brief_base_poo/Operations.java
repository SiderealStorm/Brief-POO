package brief_base_poo;

public class Operations {
	public double a;
	public double b;
	
	// Constructeur :
	public Operations(double a, double b) {
		this.a = a;
		this.b = b;
	}


	public double add() {
		return a + b;
	}
	
	public double subs() {
		return a - b;
	}
	
	public double div() {
		return a / b;
	}
	
	public double mult() {
		return a * b;
	}
	
}
