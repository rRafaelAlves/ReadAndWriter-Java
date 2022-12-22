package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ReadAndWriter{
	
	private String pathFileRead;
	private String pathFileWriter;
	
	
	/*
	 * Construtor que recebe o caminho do arquivo que será lido e do arquivo que será escrito, 
	 * guardando os valoes nos atríbutos locais.
	 *
	 */
	
	public ReadAndWriter(String pathFileRead, String pathFileWriter ) {
		this.pathFileRead = new String(pathFileRead);
		this.pathFileWriter = new String(pathFileWriter);
	}
	
	
	/* Método que após já instanciado o objeto pela referência com os valores,
	 * pode usar esses valores para fazer a cópia do leitor pro escritor.
	 */
	
	public void sendReading() throws IOException {
		
	// Criando a leitura do arquivo
		
		InputStream fis = new FileInputStream(pathFileRead);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
	// Criando a escrita do arquivo
		
		OutputStream os = new FileOutputStream(pathFileWriter);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
	
		
	// Variável que captura os caracteres do Buffered br e usa o readLine para junta-los em uma linha
		
		String linha = br.readLine();
		
		
	// Laço para que todas as linhas sejam percorridas e passadas para o escritor
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}
	
}