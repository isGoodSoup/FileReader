package com.filereader.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
	
	/**
	 * Reads a file and returns the lines in String.
	 * 
	 * @param File's path
	 * @return File's lines list
	 * @throws IOException
	 */
	public List<String> readFile(String archivo) throws IOException {
		String file = Files.readString(Paths.get(archivo));
		return file.lines().toList();
	}
}