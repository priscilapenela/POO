package tps2;

import java.io.IOException;

public class testContras {

	public static void main(String[] args) throws IOException {

		try {
			Archivo archivo = new Archivo();
			archivo.lecturaEscritura();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
