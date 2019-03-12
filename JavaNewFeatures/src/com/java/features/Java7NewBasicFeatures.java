package com.java.features;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Java7NewBasicFeatures {

	public static void main(final String[] args) {
		int val = 1_000_000;
		long longtest = 0b000110_00111;
		long tt = 0x000_ffff;
		int swVal = 1;

		String string = "osman";
		switch (string) {
		case "osman":
			System.out.println("Seçim 1");
			break;
		case "mehmet":
			System.out.println("Seçim 2");
			break;

		default:
			break;
		}

		try {
			File file = new File("test.txt");
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		} catch (IOException | IllegalAccessError e) {

		} catch (NullPointerException e) {

		} catch (Exception e) {

		}

		// JAVA 1.6
		FileInputStream fileInputStream = null;
		try {
			File file = new File("test.txt");
			fileInputStream = new FileInputStream(file);
			fileInputStream.read();
		} catch (IOException | IllegalAccessError e) {

		} catch (NullPointerException e) {

		} catch (Exception e) {

		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

		// JAVA 1.7

		File file = new File("test.txt");
		try (FileInputStream fileInputStream2 = new FileInputStream(file)) {
			fileInputStream2.read();
		} catch (IOException | IllegalAccessError e) {

		} catch (NullPointerException e) {

		} catch (Exception e) {

		}

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Seçiminizi yapýnýz : ");
			int nextInt = scanner.nextInt();
			System.out.println("Seçtiðiniz : " + nextInt);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// JAVA 1.6
		List<String> strs = new ArrayList<String>();

		// JAVA 1.7
		List<String> strs2 = new ArrayList<>();

		Collection<String> synchronizedCollection = Collections.synchronizedCollection(strs2);
		synchronizedCollection.add("test1");

	}

}
