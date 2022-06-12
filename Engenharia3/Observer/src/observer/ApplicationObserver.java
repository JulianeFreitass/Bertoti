package observerpattern;

import observerpattern.Library;
import observerpattern.Book;

public class ApplicationObserver {
	public static void main(String[] args) {
		Library library = new Library();
		new Book(library);
		library.setEstado("Fantasia");
		System.out.println("\n=======================================================\n");
		library.setEstado("Romance");
	}
}