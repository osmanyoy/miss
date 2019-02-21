package com.training.patterns.behavioral.command;

import java.util.Scanner;

public class CommandRunner {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

		if (args[0].equals("ADMIN")) {
			System.out.println("Menu");
			System.out.println("1-Action1");
			System.out.println("2-Action2");
			System.out.println("3-Action3");
			System.out.println("4-Action3");
			System.out.println("Choose:");
			int nextInt = scanner.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("Action 1");
				break;
			case 2:
				System.out.println("Action 2");
				break;
			case 3:
				System.out.println("Action 3");
				break;
			case 4:
				System.out.println("Action 4");
				break;

			default:
				break;
			}
		}
		if (args[0].equals("USER")) {
			System.out.println("Menu");
			System.out.println("1-Action1");
			System.out.println("2-Action3");
			System.out.println("3-Action4");
			System.out.println("Choose:");
			int nextInt = scanner.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("Action 1");
				break;
			case 2:
				System.out.println("Action 3");
				break;
			case 3:
				System.out.println("Action 4");
				break;

			default:
				break;
			}

		}
	}
}
