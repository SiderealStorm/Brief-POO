package brief_base_poo;

public class Livre {
	private String bookTitle;
	private String authorFirstname;
	private String authorLastname;
	private String category;
	private String isbnCode;
	private String bookCode;
	
	// Création du code du livre (private car utilisé dans la classe uniquement):
	private String createCode() {
		return authorLastname.substring(0,2) + authorFirstname.substring(0,2) + category.substring(0,1) + isbnCode.substring(0,2);
	}
	
	// Affichage des informations du livre:
	public void seeInfos() {
		System.out.println("\"" + bookTitle + "\" de " + authorFirstname + " " + authorLastname);
		System.out.println("Catégorie : " + category);
		System.out.println("ISBN : " + isbnCode);
		System.out.println("Code du livre : " + bookCode);
	}
	
//	// Ou avec toString:
//	public String toString() {
//		String bookCode = authorLastname.substring(0,2) + authorFirstname.substring(0,2) + category.substring(0,1) + isbnCode.substring(0,2);
//		return bookTitle + "\nAuteur : " + authorFirstname + " " + authorLastname + "\nCatégorie : " + category + "\nISBN : " + isbnCode + "\nCode du livre : " + bookCode;
//	}
	
	// Getters/Setters
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorFirstname() {
		return authorFirstname;
	}

	public void setAuthorFirstname(String authorFirstname) {
		this.authorFirstname = authorFirstname;
	}

	public String getAuthorLastname() {
		return authorLastname;
	}

	public void setAuthorLastname(String authorLastname) {
		this.authorLastname = authorLastname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(String isbnCode) {
		this.isbnCode = isbnCode;
	}

	public String getBookCode() {
		return bookCode;
	}

	// Le code du livre est créé en utilisant le setter:
	public void setBookCode() {
		this.bookCode = createCode();
	}

}
