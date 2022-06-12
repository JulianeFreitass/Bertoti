package observer;

import observer.Library;

public abstract class Observer {
	protected Library estado;

	public abstract void update();
}