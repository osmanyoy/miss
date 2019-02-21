package com.training.patterns.behavioral.template;

public class XMLTemplate extends AbstractMessage {

	@Override
	public void header(final String str) {
		this.sb.append("<message>");
		this.sb.append("<header>");
		this.sb.append(str);
		this.sb.append("</header>");

	}

	@Override
	public void body(final String str) {
		this.sb.append("<body>");
		this.sb.append(str);
		this.sb.append("</body>");

	}

	@Override
	public void footer(final String str) {
		this.sb.append("<footer>");
		this.sb.append(str);
		this.sb.append("</footer>");
		this.sb.append("</message>");

	}

}
