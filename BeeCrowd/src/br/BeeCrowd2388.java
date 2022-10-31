package br;

import java.util.Scanner;

public class BeeCrowd2388 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int qtdeIntervalos=ent.nextInt(),horas, velMedia, total=0 ;
		for (int i = 0; i < qtdeIntervalos; i++) {
			horas=ent.nextInt();
			velMedia=ent.nextInt();
			total+=horas*velMedia;
		}
		System.out.println(total);
		ent.close();
	}

}
