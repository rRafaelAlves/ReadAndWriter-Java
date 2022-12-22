package br.com.alura.java.io.teste;

import java.io.IOException;

public class TestarDesafio {

	public static void main(String[] args) throws IOException {
		
		ReadAndWriter transferer = new ReadAndWriter("lorem.txt", "lorem2.txt");
		
		transferer.sendReading();
	}

}
