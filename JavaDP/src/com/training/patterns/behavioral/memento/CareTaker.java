package com.training.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementos = new ArrayList<>();
	private int current = -1;

	public void addMemento(final Session session) {
		this.mementos.add(session.createMemento());
	}

	public Session returnToHistory(final int index, final Session session) {
		this.current = index;
		return session.returnTo(this.mementos.get(index));
	}

	public Session returPrev(final Session session) {
		if ((this.current > 0) && (this.current < this.mementos.size())) {
			this.current = this.current - 1;
			return session.returnTo(this.mementos.get(this.current));
		}
		return null;
	}
}
