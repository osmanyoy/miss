package com.training.patterns.behavioral.command;

public class Action2 implements ICommand {

	@Override
	public void execute() {
		System.out.println("Action 2");
	}

	@Override
	public String getDesc() {
		return "Action2";
	}

}
