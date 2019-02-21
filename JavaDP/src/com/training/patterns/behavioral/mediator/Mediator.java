package com.training.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator {

	private Map<String, IListener> indiviListeners = new HashMap<>();
	private Map<String, List<IListener>> groupListeners = new HashMap<>();

	public void register(final String group, final IListener listener) {
		this.indiviListeners.put(listener.getName(),
		                         listener);
		if ((group != null) && !group.isEmpty()) {
			List<IListener> list = this.groupListeners.get(group);
			if (list == null) {
				list = new ArrayList<>();
				this.groupListeners.put(group,
				                        list);
			}
			list.add(listener);
		}
	}

	public void sendTo(final String name, final Message msg, final IListener originatorListener) {
		IListener iListener = this.indiviListeners.get(name);
		if (iListener != null) {
			iListener.listen(originatorListener.getName(),
			                 msg);
		}
	}

	public void sendToGroup(final String group, final Message msg, final IListener originatorListener) {
		List<IListener> iListener = this.groupListeners.get(group);
		if (iListener != null) {
			for (IListener iListener2 : iListener) {
				if (iListener2 != originatorListener) {
					iListener2.listen(originatorListener.getName(),
					                  msg);
				}
			}
		}
	}

	public void sendToAll(final Message msg, final IListener originatorListener) {
		Collection<IListener> values = this.indiviListeners.values();
		for (IListener iListener : values) {
			if (iListener != originatorListener) {
				iListener.listen(originatorListener.getName(),
				                 msg);
			}
		}
	}

}
