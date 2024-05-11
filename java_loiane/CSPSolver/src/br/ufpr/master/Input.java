package br.ufpr.master;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {
	
	public void lerArquivo() throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/arquivo/example.txt"));
			String line;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
