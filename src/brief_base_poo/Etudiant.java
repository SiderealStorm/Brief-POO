package brief_base_poo;

public class Etudiant {
	public String firstName;
	public String lastName;
	public double[] grades;
	private String initials;
	private String trigram;

	// Calculer la moyenne des notes:
	public double mean() {
		double sum = 0;
		for (double grade : grades) {
			sum += grade;
		}
		return sum / grades.length;
	}
	
	//Getters/Setters
	
	public String getInitials() {
		return initials;
	}

	// Création des initiales:
	public void setInitials() {
		this.initials = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase();
	}

	public String getTrigram() {
		return trigram;
	}

	// Création du trigramme:
	public void setTrigram() {
		this.trigram = firstName.substring(0,1).toUpperCase() + lastName.substring(0,1).toUpperCase() + lastName.substring(lastName.length()-1,lastName.length()).toUpperCase();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	
}
