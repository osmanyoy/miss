package com.training.patterns.behavioral.mediator;

public class MediatorRunner {
	public static void main(final String[] args) {
		Mediator mediator = new Mediator();
		IListener listenerA = new ModuleA(mediator);
		IListener listenerB = new ModuleB(mediator);
		IListener listenerC = new ModuleC(mediator);
		IListener listenerD = new ModuleD(mediator);
		mediator.register("group1",
		                  listenerA);
		mediator.register("group1",
		                  listenerB);

		mediator.register("group2",
		                  listenerC);
		mediator.register("group2",
		                  listenerD);

	}
}
