package com.java.proje;

public class Kriterler {
	private String ck;
	private String bk;
	private String tk;
	private String n;
	private int amount;

	public Kriterler() {
		// TODO Auto-generated constructor stub
	}

	public Kriterler(final String ck, final String bk, final String tk, final String n, final int amount) {
		super();
		this.ck = ck;
		this.bk = bk;
		this.tk = tk;
		this.n = n;
		this.amount = amount;
	}

	public String getCk() {
		return this.ck;
	}

	public void setCk(final String ck) {
		this.ck = ck;
	}

	public String getBk() {
		return this.bk;
	}

	public void setBk(final String bk) {
		this.bk = bk;
	}

	public String getTk() {
		return this.tk;
	}

	public void setTk(final String tk) {
		this.tk = tk;
	}

	public String getN() {
		return this.n;
	}

	public void setN(final String n) {
		this.n = n;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(final int amount) {
		this.amount = amount;
	}

}
