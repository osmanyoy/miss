package com.training.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Observer extends AbstractObserver {
	private static Observer instance = new Observer();

	private Map<EEventType, List<IObserver>> observerMap = new HashMap<>();

	private Observer() {
	}

	public static IObserver getIntance() {
		return Observer.instance;
	}

	@Override
	public void fire(final EEventType eEventType, final String str) {
		List<IObserver> list = this.observerMap.get(eEventType);
		for (IObserver iObserver : list) {
			iObserver.fire(eEventType,
			               str);
		}

	}

	@Override
	public void register(final EEventType eEventType, final IObserver observer) {

		List<IObserver> list = this.observerMap.get(eEventType);
		if (list == null) {
			list = new ArrayList<>();
			this.observerMap.put(eEventType,
			                     list);
		}
		list.add(observer);
	}
}
