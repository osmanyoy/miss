package com.java.proje;

import java.util.List;

public class FilterFactory {
	public static AbstractFilter createFilterChain(final List<Kriterler> kris) {
		AbstractFilter prev = null;
		AbstractFilter current = null;
		for (Kriterler kri : kris) {
			current = new AbstractFilter(prev, kri);
			prev = current;
		}
		return current;
	}
}
