package com.training.patterns.creational.absfactory;

public class HaliYikamaMakinesi {

	public void yika(final EHalitipi haliTipi) {
		ISuAtma suAtma = SuAtmaFactory.createSuAtma(haliTipi);
		IYikama yikama = YikamaFactory.createYikama(haliTipi);

		suAtma.suAt();
		yikama.kopurt();
		suAtma.suAt();
		yikama.yika();
	}

	public void yikaAbstractFactory(final EHalitipi haliTipi) {
		IHaliYikamaMakinesi hym = HYMFactory.createHYM(haliTipi);
		ISuAtma suAtma = hym.createSuAtma();
		IYikama yikama = hym.createYikama();

		suAtma.suAt();
		yikama.kopurt();
		suAtma.suAt();
		yikama.yika();

	}

	public void yikaOld(final EHalitipi haliTipi) {
		ISuAtma suAtma = null;
		IYikama yikama = null;
		switch (haliTipi) {
		case HALIFLEX:
			suAtma = new HaliflexSuAtma();
			yikama = new HaliflexYikama();
			break;
		case INCE:
			suAtma = new InceHaliSuAtma();
			yikama = new InceHaliYikama();
			break;

		case KALIN:
			suAtma = new KalinHaliSuAtma();
			yikama = new KalinHaliYikama();
			break;
		default:
			break;
		}
		suAtma.suAt();
		yikama.kopurt();
		suAtma.suAt();
		yikama.yika();
	}

}
