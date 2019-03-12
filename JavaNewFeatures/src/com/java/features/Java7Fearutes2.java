package com.java.features;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Java7Fearutes2 {
	public static void main(final String[] args) throws Exception {
		Path filePath = Paths.get("d:/temp/test.txt");
		System.out.println(filePath.getFileName());
		System.out.println(filePath.getParent());
		System.out.println(filePath.getRoot());
		System.out.println(filePath.getNameCount());
		System.out.println(filePath.toAbsolutePath());
		System.out.println(Files.exists(filePath));
		if (Files.exists(filePath)) {
			Path filePath2 = Paths.get("d:/temp1/ttt.txt");
			Files.copy(filePath,
			           filePath2,
			           StandardCopyOption.REPLACE_EXISTING);
		}

	}
}
