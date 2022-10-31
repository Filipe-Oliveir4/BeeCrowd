package br;

import java.util.Scanner;

public class BeeCrowd1014 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int x = ent.nextInt();
		double y = ent.nextDouble();
		double media =x/y;
		System.out.printf("%.3f km/l\n",media);		
		ent.close();

	}

}
