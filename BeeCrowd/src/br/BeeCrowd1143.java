package br;

import java.util.Scanner;

public class BeeCrowd1143 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int qtdeLinha=ent.nextInt(),quadrado,cubo;
		for (int valor = 1; valor <=qtdeLinha ; valor++) {
			quadrado=valor*valor;
			cubo=quadrado*valor;
			System.out.println(valor+" "+quadrado+" "+cubo);
		}
		ent.close();
	}

}
