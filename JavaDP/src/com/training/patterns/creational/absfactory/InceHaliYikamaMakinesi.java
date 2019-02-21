package com.training.patterns.creational.absfactory;

public class InceHaliYikamaMakinesi implements IHaliYikamaMakinesi {

	@Override
	public ISuAtma createSuAtma() {
		return new InceHaliSuAtma();
	}

	@Override
	public IYikama createYikama() {
		return new InceHaliYikama();
	}

}
