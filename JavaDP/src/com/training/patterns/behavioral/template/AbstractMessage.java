package com.training.patterns.behavioral.template;

public abstract class AbstractMessage implements IMessage {
	protected StringBuilder sb = new StringBuilder(100);

	@Override
	public String getMessage() {
		return this.sb.toString();
	}
}
