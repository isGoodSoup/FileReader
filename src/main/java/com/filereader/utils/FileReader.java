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
	public List<String> readFile(String file) throws IOException {
		String lines = Files.readString(Paths.get(file));
		return lines.lines().toList();
	}
}