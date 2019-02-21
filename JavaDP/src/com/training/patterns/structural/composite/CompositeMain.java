package com.training.patterns.structural.composite;

public class CompositeMain {
	public static void main(final String[] args) {
		Tree firsTree = new Tree("First");

		Tree subtree = new Tree("sub10");
		firsTree.addChild(subtree);

		Tree subtree5 = new Tree("sub50");
		subtree.addChild(subtree5);

		Tree subtree6 = new Tree("sub60");
		subtree5.addChild(subtree6);

		Tree subtree2 = new Tree("sub11");
		firsTree.addChild(subtree2);

		Tree subtree3 = new Tree("sub20");
		subtree2.addChild(subtree3);

		Tree subtree4 = new Tree("sub30");
		subtree3.addChild(subtree4);

		System.out.println(firsTree);
	}
}
