package com.training.patterns.structural.bridge;

public class ArabaRunner {
	public static void main(final String[] args) {
		DizelYakitTipi dizelYakitTipi = new DizelYakitTipi();
		BMW bmw = new BMW(dizelYakitTipi);
		bmw.ileriGit();
	}
}
