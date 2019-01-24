package com.fileapp.api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class BankApp {

	public static void main(String[] args) throws FileNotFoundException {
		dataReader();
	}

	@SuppressWarnings("unused")
	private static Map<Integer, StringBuilder> dataReader() throws FileNotFoundException {
		Map<Integer, StringBuilder> bankMap = new TreeMap<>();
		String text;
		String[] data = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\File\\data.txt")))) {
			while ((text = reader.readLine()) != null) {
				data = text.split(",");
				StringBuilder builder = new StringBuilder();
				for (String str : data) {
					builder.append(str).append(",").toString();
				}
				bankMap.put(Integer.valueOf(data[0]), builder);

			}
		} catch (Exception e) {
			throw new FileNotFoundException("File reader Failed..." + e.getLocalizedMessage().toString());
		}

		bankMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "..." + e.getValue()));
		return bankMap;

	}

}
