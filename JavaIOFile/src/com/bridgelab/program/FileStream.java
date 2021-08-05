package com.bridgelab.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileStream {

	public static void main(String[] args) {
		try
		{
			byte bWrite [] = {11,21,3,40,5};
			OutputStream os = new FileOutputStream("C://Users//User//Desktop//FileIO.txt");
			for(int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]);
			}
			os.close();
			InputStream is = new FileInputStream("C://Users//User//Desktop//FileIO.txt");
			int size = is.available();
			for(int i = 0; i < size; i++)
			{
				System.out.println((char)is.read() + " ");
			}
		}catch(IOException e) {
			System.out.println("Exception");
		}

	}

}
