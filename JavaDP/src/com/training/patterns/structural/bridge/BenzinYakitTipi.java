package com.training.patterns.structural.bridge;

public class BenzinYakitTipi extends YakitTipi {

	@Override
	public void ileriGit(final String name) {
		System.out.println("Benzinli " + name + " ileri gidiyor");
	}

}
