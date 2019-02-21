package com.training.patterns.structural.proxy;

import com.training.patterns.structural.adapter.PrinterSystem;

public class PrinterSystemFactory {

	public static PrinterSystem createPrinterSystem() {
		int type = 2;
		switch (type) {
		case 1:
			return new PrinterSystem();
		case 2:
			return new PrinterSystemProxy(new PrinterSystem());

		default:
			return null;
		}
	}
}
