package com.training.patterns.creational.absfactory;

public class HYMFactory {

	public static IHaliYikamaMakinesi createHYM(final EHalitipi haliTipi) {
		switch (haliTipi) {
		case HALIFLEX:
			return new HaliflexHaliYikamaMakinesi();
		case INCE:
			return new InceHaliYikamaMakinesi();
		case KALIN:
			return new KalinHaliYikamaMakinesi();
		default:
			break;
		}
		return null;
	}

}
