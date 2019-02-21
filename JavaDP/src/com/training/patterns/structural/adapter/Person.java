package com.training.patterns.structural.adapter;

public class Person {
	private String isim;
	private String soyisim;
	private String email;

	public String getIsim() {
		return this.isim;
	}

	public void setIsim(final String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return this.soyisim;
	}

	public void setSoyisim(final String soyisim) {
		this.soyisim = soyisim;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

}
