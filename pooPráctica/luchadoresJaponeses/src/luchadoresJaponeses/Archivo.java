package luchadoresJaponeses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public void lecturaEscritura() throws IOException, Exception {
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner i;
		Torneo t1 = null;
		Sumo sumito;
		try {
			in = new BufferedReader(new FileReader("./Archivos/Entrada.in"));
			out = new PrintWriter(new FileWriter("./Archivos/Salida.out"));
			i = new Scanner(in);
			int cantSumitos = 0;
			int a = 0;
			int peso = 0;
			int altura = 0;

			while (i.hasNextInt()) {
				if (cantSumitos == 0) {
					cantSumitos = i.nextInt();
					t1 = new Torneo(cantSumitos);
				} else {
					if (a == 0) {
						peso = i.nextInt();
						a = 1;
					}
					if (a == 1) {
						altura = i.nextInt();
						a = 2;
					}
					if (a == 2) {
						a = 0;
						sumito = new Sumo(peso, altura);
						t1.addParticipantes(sumito);

					}

				}

			}

			for (Integer s : t1.isDominante()) {
				System.out.println(s);
				out.println(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
