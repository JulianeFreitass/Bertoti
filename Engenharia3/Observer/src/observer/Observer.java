package observerpattern;

import observerpattern.Library;

public abstract class Observer {
	protected Library estado;

	public abstract void update();
}