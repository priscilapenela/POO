package luchadoresJaponeses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {

	public void Lectura() {
		File archivo = null;
		String i = null;
		StringBuilder s;
		try {
			archivo = new File("./Archivos/Entrada.in");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			while((i = br.readLine()) != null) {
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}