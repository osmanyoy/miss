package com.training.patterns.behavioral.template;

public interface IMessage {
	void header(String str);

	void body(String str);

	void footer(String str);

	String getMessage();
}
