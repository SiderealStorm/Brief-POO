package brief_base_poo;

import java.util.Scanner;

public class Main {
	
	// Je m'excuse de l'utilisation du français ET de l'anglais,
	// mais j'avais créé les classes en français pour coller à l'énoncé
	// et je ne savais pas si je pouvais les renommer

	public static void main(String[] args) {
		
		// Création de la variable pour la saisie utilisateur:
		Scanner input = new Scanner(System.in);
		
		// Saisie utilisateur d'une chaîne de caractères:
		System.out.println("Entrez une chaîne de caractères :");
		String chain = input.nextLine();
		
		
		// Exercice 1
		
		System.out.println("Nombre de caractères de la chaîne : " + chain.length());
		
		
		// Exercice 2

		System.out.println(chain.toUpperCase());
		System.out.println(chain.toLowerCase());
		
		
		// Exercice 3
		
		// Utilisation d'une fonction pour modifier la chaîne:
		System.out.println(replaceCharacter(chain));
		
		
		// Exercice 4
		
		Livre book1 = new Livre();
		book1.setBookTitle("Un Livre");
		book1.setAuthorFirstname("Prénom");
		book1.setAuthorLastname("Nom");
		book1.setCategory("Divers");
		book1.setIsbnCode("1234567890");
		book1.setBookCode();
		
		book1.seeInfos();
		
		Livre book2 = new Livre();
		book2.setBookTitle("Un Autre Livre");
		book2.setAuthorFirstname("Prénom");
		book2.setAuthorLastname("Nom");
		book2.setCategory("Suspense");
		book2.setIsbnCode("0123456789");
		book2.setBookCode();
		
		Bibliotheque biblio = new Bibliotheque();
		biblio.ajouterLivre(book1);
		biblio.ajouterLivre(book2);
		
		biblio.voirLivres();

		// Exercice 5
		
		Triangle triangle = new Triangle();
		triangle.setA(3);
		triangle.setB(6);
		triangle.setC(4);
		triangle.setLenAB(8);
		triangle.setLenBC(12);
		triangle.setLenCA(5.5);
		System.out.println(triangle.surface());
		
		triangle.transpose(2);
		System.out.println("Position de A : " + triangle.getA());
		System.out.println("Position de B : " + triangle.getB());
		System.out.println("Position de C : " + triangle.getC());
		
		triangle.reduce(10);
		System.out.println("Longueur de AB : " + triangle.getLenAB());
		System.out.println("Longueur de BC : " + triangle.getLenBC());
		System.out.println("Longueur de CA : " + triangle.getLenCA());
		
		
		// Exercice 6
		
		Operations numbers = new Operations(8,3);
		
		System.out.println("Addition : " + numbers.add());
		System.out.println("Soustraction : " + numbers.subs());
		System.out.println("Division : " + numbers.div());
		System.out.println("Multiplication : " + numbers.mult());
		
		
		// Exercice 7

		double[] gradesList = {12.5, 15, 19, 9, 16, 7.5, 17};
		
		Etudiant student = new Etudiant();
		student.setFirstName("John");
		student.setLastName("Doe");
		student.setGrades(gradesList);
		student.setInitials();
		student.setTrigram();
		
		System.out.println("Moyenne de John Doe : " + student.mean());
		System.out.println("Initiales : " + student.getInitials());
		System.out.println("Trigrame : " + student.getTrigram());
	
		// Exercice 8
		
		// Utilisation du constructeur par défaut :
		Voiture myCar = new Voiture();
		
		myCar.setCarType("Citroën C2");
		myCar.setDoors(3);
		myCar.setSeats(4);
		myCar.setFuel("Diesel");

		// Utilisation du constructeur par recopie :
		Voiture myCarCopy = new Voiture(myCar);
		
		// Utilisation du constructeur par paramètres :
		Voiture myNextCar = new Voiture("Toyota Yaris", 5, 5, "Hybride");

		System.out.println("Ma voiture est une " + myCar);
		System.out.println("Ma voiture copiée est une " + myCarCopy);
		System.out.println("Ma prochaine voiture sera une " + myNextCar);
		
	}

	
	// Fonctions :
	
	// Exercice 3
	
	public static String replaceCharacter(String string) {
		StringBuilder newString = new StringBuilder(string);
		for (int i = 0; i < newString.length(); i += 2) {
			newString.setCharAt(i, '*');
		}
		return newString.toString();
	}

	
}
