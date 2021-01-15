package design_pattern_observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{

	private int state=10;
	private List<Observer>observer=new ArrayList<Observer>();
	@Override
	public void subscribe(Observer o) {
		this.observer.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		this.observer.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer o:observer) {
			o.update(this);
		}
		
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObserver();
	}

	
}
