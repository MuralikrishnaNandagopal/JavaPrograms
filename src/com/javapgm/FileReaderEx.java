package com.javapgm;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReaderEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		System.out.println("\nfile & BufferedReader....");
		File file = new File("D:\\WorkSpace\\JavaPrograms\\src\\com\\javapgm\\Hello.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);

		System.out.println("\nFileReader....");
		FileReader fr = new FileReader("D:\\WorkSpace\\JavaPrograms\\src\\com\\javapgm\\Hello.txt");
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);

		System.out.println("\n\nUsing Scanner..");
		File filescan = new File("D:\\WorkSpace\\JavaPrograms\\src\\com\\javapgm\\Hello.txt");
		Scanner sc = new Scanner(filescan);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());

		System.out.println("\nUsing Scanner with delimiter.");
		File filescandelimiter = new File("D:\\WorkSpace\\JavaPrograms\\src\\com\\javapgm\\Hello.txt");
		Scanner scdl = new Scanner(filescandelimiter);
		scdl.useDelimiter("\\Z");
		System.out.println(scdl.next());

		System.out.println("\nReading Text File as String..");
		String data = new String(
				Files.readAllBytes(Paths.get("D:\\WorkSpace\\JavaPrograms\\src\\com\\javapgm\\Hello.txt")));
		System.out.println(data);

		System.out.println("\nReading Text File in Java 8...");
		Path filePath = Paths.get("D:/Workspace/JavaPrograms/src/com/javapgm", "Hello.txt");
		try (Stream<String> lines = Files.lines(filePath)) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}