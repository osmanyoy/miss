package com.training.patterns.behavioral.mediator;

public class ModuleB extends AbstractListener {

	public ModuleB(final Mediator mediator) {
		super(mediator);
	}

	@Override
	public void listen(final String originator, final Message msg) {
		System.out.println(this.getName() + " From : " + originator + " message : " + msg.getStr());
	}

	@Override
	public String getName() {
		return "moduleB";
	}

}
