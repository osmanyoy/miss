package com.training.patterns.behavioral.mediator;

public class ModuleA extends AbstractListener {

	public ModuleA(final Mediator mediator) {
		super(mediator);
		MyThread myThread = new MyThread(this);
		myThread.start();
	}

	@Override
	public void listen(final String originator, final Message msg) {
		System.out.println(this.getName() + " From : " + originator + " message : " + msg.getStr());
	}

	@Override
	public String getName() {
		return "moduleA";
	}

	public static class MyThread extends Thread {
		private ModuleA moduleA;

		public MyThread(final ModuleA moduleA) {
			super();
			this.moduleA = moduleA;
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(2_000);
					Message msg = new Message();
					msg.setStr("Test message");

					this.moduleA.getMediator()
					            .sendToAll(msg,
					                       this.moduleA);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
