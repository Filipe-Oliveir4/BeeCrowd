package br;

import java.util.Scanner;

public class BeeCrowd1002 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double area,raio;
		final double n =3.14159;
		raio = ent.nextDouble();
		area = n*(raio*raio);
		System.out.printf("A=%.4f\n",area);
		ent.close();
	}

}
