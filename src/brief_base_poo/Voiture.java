package brief_base_poo;

public class Voiture {
	private String carType;
	private int doors;
	private int seats;
	private String fuel;
	
	// Constructeur vide:
	public Voiture() {
	}
	
	// Constructeur par paramètres:
	public Voiture(String carType, int doors, int seats, String fuel) {
		this.carType = carType;
		this.doors = doors;
		this.seats = seats;
		this.fuel = fuel;
	}
	
	// Constructeur par recopie:
	public Voiture(Voiture car) {
		this.carType = car.carType;
		this.doors = car.doors;
		this.seats = car.seats;
		this.fuel = car.fuel;
	}
	
	public String toString() {
		return carType + " : " + doors + " portes, " + seats + " sièges, motorisation " + fuel;
	}
	
	
	// Getters/Setters
	
	public String getCarType() {
		return carType;
	}
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
