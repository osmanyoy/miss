package com.java.proje;

public class AbstractFilter {
	private AbstractFilter next;
	private Kriterler kriterler;

	public AbstractFilter(final AbstractFilter nextParam, final Kriterler kriterler) {
		this.next = nextParam;
		this.kriterler = kriterler;

	}

	public Kriterler execute(final Kriterler kriterlerParam) {
		Kriterler run = this.run(kriterlerParam);
		if (run == null) {
			if (this.next != null) {
				return this.next.execute(kriterlerParam);
			} else {
				return null;
			}

		} else {
			return this.kriterler;
		}

	}

	public Kriterler run(final Kriterler kriterlerParam) {
		if (this.kriterler.getCk()
		                  .equals("*")
		        || this.kriterler.getCk()
		                         .equals(kriterlerParam.getCk())) {
			if (this.kriterler.getBk()
			                  .equals("*")
			        || this.kriterler.getBk()
			                         .equals(kriterlerParam.getBk())) {
				if (this.kriterler.getTk()
				                  .equals("*")
				        || this.kriterler.getTk()
				                         .equals(kriterlerParam.getTk())) {
					if (this.kriterler.getN()
					                  .equals("*")
					        || this.kriterler.getN()
					                         .equals(kriterlerParam.getN())) {
						return kriterlerParam;
					}

				}

			}

		}
		return null;
	}

}
