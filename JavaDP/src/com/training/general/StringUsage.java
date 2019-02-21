package com.training.general;

public class StringUsage {
	public static void main(final String[] args) {
		// String str = new String("osman"); yanlýþ
		int i = 20;
		String otherStr = " test ";
		long delta = System.currentTimeMillis();
		for (int j = 0; j < 1_000_000; j++) {
			String str1 = "osman sldsklajdjashdksdjkjsahkdj dlskflkdsjlfkdjsf " + i
					+ " deneme dskhfgsdkgfdsgfjhdgsjhfgjhsdgfjhdsgfjsg" + otherStr;
			str1 += j + " dsjfhkjdshjdsfhj";

			String str2 = String.format(
					"osman sldsklajdjashdksdjkjsahkdj dlskflkdsjlfkdjsf %d deneme dskhfgsdkgfdsgfjhdgsjhfgjhsdgfjhdsgfjsg %s %d dsjfhkjdshjdsfhj",
					i, otherStr, j);

			StringBuilder builder = new StringBuilder(100);
			builder.append("osman sldsklajdjashdksdjkjsahkdj dlskflkdsjlfkdjsf ");
			builder.append(i);
			builder.append(" deneme dskhfgsdkgfdsgfjhdgsjhfgjhsdgfjhdsgfjsg");
			builder.append(otherStr);
			builder.append(j);
			builder.append(" dsjfhkjdshjdsfhj");
			String str3 = builder.toString();
		}
		System.out.println("Delta : " + (System.currentTimeMillis() - delta));
	}
}
