package tps2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	public void lecturaEscritura() throws IOException {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader("./Archivos/Archivo.in"));
			out = new PrintWriter(new FileWriter("./Archivos/Archivo.out"));
			String linea;

			while ((linea = in.readLine()) != null) { //segun cada linea leida va a escribir en el archivo.out
				Contra contrasenia = new Contra(linea); //se envia la linea como parámetro al contructor 
				out.println(contrasenia.obtenerContra().size()); //se escribe la cantidad de contraseñas 
				for (String c : contrasenia.obtenerContra()) { //se recorre cada elemento del ArrayList que devuelve el método obtenerContra()
					out.println(c);
				}

			}

		} catch (IOException e) { //ataja las excepciones que puedan generar los archivos
			e.printStackTrace();
		} catch (Exception e) { //ataja las excepciones de la clase Contra
			System.out.print(e.getMessage());
		} finally { //cierra los archivos
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}
}
