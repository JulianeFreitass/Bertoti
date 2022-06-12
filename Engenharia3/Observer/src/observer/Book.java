package observer;

import observer.Library;
import observer.Observer;

public class Book extends Observer {
	public Book(Library estado) {
		this.estado = estado;
		this.estado.attach(this);
	}

	public void update() {
		System.out.println("Foi lancado uma novo livro de: " + this.estado.getEstado());
	}
}