package com.training.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyData implements Iterable<String> {
	private final List<String> myStrs;

	public MyData() {
		this.myStrs = new ArrayList<>(110);

	}

	public void addStr(final String addStr) {
		this.myStrs.add(addStr);
	}

	public Iterator<String> getIterator() {
		return new MyDataIterator(this.myStrs);
	}

	public MyIterator<String> getIterator2() {
		return new MyDataIterator2(this.myStrs);
	}

	public static class MyDataIterator implements Iterator<String> {
		private Iterator<String> it;
		private List<String> myStrs2;

		public MyDataIterator(final List<String> myStrs) {
			this.myStrs2 = myStrs;
			this.it = myStrs.iterator();
		}

		@Override
		public boolean hasNext() {
			return this.it.hasNext();
		}

		@Override
		public String next() {
			return this.it.next();
		}

	}

	public static class MyDataIterator2 implements MyIterator<String> {
		private List<String> myStrs2;
		private int index;

		public MyDataIterator2(final List<String> myStrs) {
			this.myStrs2 = myStrs;
		}

		@Override
		public boolean dahaVarmi() {
			return this.index < this.myStrs2.size();
		}

		@Override
		public String sonrakiniVer() {
			return this.myStrs2.get(this.index++);
		}

	}

	@Override
	public Iterator<String> iterator() {
		return new MyDataIterator(this.myStrs);
	}

}
