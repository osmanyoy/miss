package com.training.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandFactory {
	private static Map<String, List<ICommand>> commandMap = new HashMap<>();

	static {
		List<ICommand> adminList = new ArrayList<>();
		adminList.add(new Action1());
		adminList.add(new Action2());
		adminList.add(new Action3());
		adminList.add(new Action4());
		CommandFactory.commandMap.put("ADMIN",
		                              adminList);

		List<ICommand> userList = new ArrayList<>();
		userList.add(new Action1());
		userList.add(new Action3());
		adminList.add(new Action4());
		CommandFactory.commandMap.put("USER",
		                              userList);

	}

	public static List<ICommand> getCommandList(final String str) {
		return CommandFactory.commandMap.get(str);
	}
}
