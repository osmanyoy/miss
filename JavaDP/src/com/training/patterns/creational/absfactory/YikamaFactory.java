package com.training.patterns.creational.absfactory;

public class YikamaFactory {

	public static IYikama createYikama(final EHalitipi haliTipi) {
		switch (haliTipi) {
		case HALIFLEX:
			return new HaliflexYikama();
		case INCE:
			return new InceHaliYikama();
		case KALIN:
			return new KalinHaliYikama();
		default:
			break;
		}
		return null;
	}

}
