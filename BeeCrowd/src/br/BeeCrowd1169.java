package br;

import java.util.Scanner;

public class BeeCrowd1169 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int inicial=0;
		int vezes = ent.nextInt();
		while(inicial<vezes) {
			int numQuadrados = ent.nextInt();
			double resultadoKg = (Math.pow(2, numQuadrados)/12)/1000;
			int novoResultado = (int) Math.floor(resultadoKg);
			System.out.println(novoResultado+ " kg");
			vezes++;}
		ent.close();



	}

}
