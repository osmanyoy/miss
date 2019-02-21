package com.training.patterns.creational.absfactory;

public class SuAtmaFactory {

	public static ISuAtma createSuAtma(final EHalitipi haliTipi) {
		switch (haliTipi) {
		case HALIFLEX:
			return new HaliflexSuAtma();
		case INCE:
			return new InceHaliSuAtma();
		case KALIN:
			return new KalinHaliSuAtma();
		default:
			return null;
		}

	}

}
