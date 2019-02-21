package com.training.patterns.behavioral.command;

import java.util.List;
import java.util.Scanner;

public class CommandRunner2 {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ICommand> commandList = CommandFactory.getCommandList(args[0]);
		System.out.println("Menu");
		int index = 1;
		for (ICommand iCommand : commandList) {
			System.out.println(index + "-" + iCommand.getDesc());
			index++;
		}
		System.out.println("Choose : ");
		int nextInt = scanner.nextInt();
		ICommand iCommand = commandList.get(nextInt - 1);
		iCommand.execute();
	}
}
