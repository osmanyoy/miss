package com.training.patterns.creational.absfactory;

public class HaliflexHaliYikamaMakinesi implements IHaliYikamaMakinesi {

	@Override
	public ISuAtma createSuAtma() {
		return new HaliflexSuAtma();
	}

	@Override
	public IYikama createYikama() {
		return new HaliflexYikama();
	}

}
