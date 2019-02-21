package com.training.patterns.behavioral.iterator;

public class IteratorRunner {
	public static void main(final String[] args) {
		MyData data = new MyData();
		for (int i = 0; i < 20; i++) {
			data.addStr("osman" + i);
		}

		for (String string : data) {
			System.out.println(string);
		}

		System.out.println("-------------------------------------");

		MyIterator<String> iterator2 = data.getIterator2();
		while (iterator2.dahaVarmi()) {
			String sonrakiniVer = iterator2.sonrakiniVer();
			System.out.println(sonrakiniVer);
		}

	}
}
