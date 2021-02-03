package com.kita.first.level4;

import java.io.File; //io: input output
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File file1 = new File("C:/JAVA_JY/file_test/file1.txt"); // 바꾸기: \\ -> /
		boolean isExist = file1.exists();
		
		if(isExist == false) {
			file1.mkdirs();
			try {
				file1.createNewFile();
			} catch(IOException e) {
				
			} catch(Exception e) {
				
			}
		}
		
		String file1Path = file1.getPath();
		boolean result = file1.isDirectory();
		boolean result2 = file1.isFile();
		file1Path.length();
		System.out.println(result);
		System.out.println(result2);
		
	}
}
