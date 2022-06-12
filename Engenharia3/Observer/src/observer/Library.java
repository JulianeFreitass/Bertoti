package observerpattern;

import java.util.ArrayList;
import java.util.List;

import observerpattern.Observer;

public class Library {
	private List<Observer> observers = new ArrayList<Observer>();
	private String library;

	public String getEstado() {
		return this.library;
	}

	public void setEstado(String estado) {
		this.library = estado;
		this.notificaTodosObservers();
	}

	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	public void notificaTodosObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}
}