package com.onlineinteract.app;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {

		// FileFilter fileFilter = new FileFilter() {
		//
		// @Override
		// public boolean accept(File pathname) {
		// // TODO Auto-generated method stub
		// return pathname.getName().endsWith(".java");
		// }
		// };

		// Lambda Expression - another way to write instances of anonymous
		// classes. Makes them easier to read and write.
		FileFilter filterLambda = (File pathname) -> pathname.getName()
				.endsWith(".java");

		File dir = new File("/tmp");

		// File[] files = dir.listFiles(fileFilter);
		File[] files = dir.listFiles(filterLambda);

		for (File f : files) {
			System.out.println(f);
		}
	}
}
