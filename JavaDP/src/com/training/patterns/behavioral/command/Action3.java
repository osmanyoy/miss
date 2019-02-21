package com.training.patterns.behavioral.command;

public class Action3 implements ICommand {

	@Override
	public void execute() {
		System.out.println("Action 3");
	}

	@Override
	public String getDesc() {
		return "Action3";
	}

}
