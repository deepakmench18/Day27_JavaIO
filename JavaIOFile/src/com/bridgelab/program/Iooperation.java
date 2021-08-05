package com.bridgelab.program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Iooperation {
	
	public static void main(String[] args) throws IOException {
		Iooperation operations = new Iooperation();
		operations.CheckSpesificFile();
		operations.createEmptyFile();
		operations.createDirectory();
		operations.deleteFile();
		operations.listAllFilesDirectories();
	}
	
	public void CheckSpesificFile() {
		Scanner sc = new Scanner(System.in);
			
		File folder = new File("E:\\");
		boolean flag = false;
		System.out.print("Enter the file name: ");
		String name = sc.next();
			
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].getName().equals(name)) 
				flag = true;	
			}
			if(flag)
				 System.out.println(name +" is present ");
			else  
				System.out.println(name+" is not present");
	}
	
	
	public void createEmptyFile() throws IOException {
		File folder = new File("E:\\Deepak.txt");
		folder.getParentFile();
		folder.createNewFile();
		System.out.println("New file created");
	}
	

	public void createDirectory() throws IOException {
		File folder = new File("E:\\Deepak");
		folder.getParentFile();
		folder.mkdir();
		System.out.println("New directory created");
	}
	
		public void deleteFile() throws IOException {
			File folder = new File("E://Deepak.txt");
			folder.getParentFile();
			folder.delete();
			System.out.println("file deleted");
		}
		
		public void listAllFilesDirectories() {
			File folder = new File("E://");
			File[] listOfFiles = folder.listFiles();

			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("File " + listOfFiles[i].getName());
				} else if (listOfFiles[i].isDirectory()) 
					System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
}
