package com.training.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private String name;

	private List<Tree> childs = new ArrayList<>();
	private Tree parent;

	public Tree(final String name) {
		super();
		this.setName(name);
	}

	public void addChild(final Tree tree) {
		if (tree == this) {
			return;
		}
		this.childs.add(tree);
		tree.parent = this;
	}

	public Tree getParent() {
		return this.parent;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.toTree(1);
	}

	public String toTree(final int tabCount) {
		String string = this.name + "\n";
		for (Tree tree : this.childs) {
			for (int i = 0; i < tabCount; i++) {
				string += "\t";
			}
			string += tree.toTree(tabCount + 1);

		}
		return string;
	}
}
