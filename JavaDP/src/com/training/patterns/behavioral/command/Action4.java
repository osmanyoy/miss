package com.training.patterns.behavioral.command;

public class Action4 implements ICommand {

	@Override
	public void execute() {
		System.out.println("Action 4");
	}

	@Override
	public String getDesc() {
		return "Action4";
	}

}
