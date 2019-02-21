package com.training.patterns.creational.absfactory;

public class HaliRunner {
	public static void main(final String[] args) {
		HaliYikamaMakinesi haliYikamaMakinesi = new HaliYikamaMakinesi();
		haliYikamaMakinesi.yika(EHalitipi.INCE);
		System.out.println("--------------------------");
		haliYikamaMakinesi.yikaAbstractFactory(EHalitipi.KALIN);
	}
}
