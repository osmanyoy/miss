package com.training.patterns.creational.absfactory;

public class KalinHaliYikamaMakinesi implements IHaliYikamaMakinesi {

	@Override
	public ISuAtma createSuAtma() {
		return new KalinHaliSuAtma();
	}

	@Override
	public IYikama createYikama() {
		return new KalinHaliYikama();
	}

}
