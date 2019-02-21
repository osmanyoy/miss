package com.training.patterns.behavioral.observer;

public interface IObserver {
	void register(EEventType eEventType, IObserver observer);

	void fire(EEventType eEventType, String str);
}
