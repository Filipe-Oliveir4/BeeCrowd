package br;

import java.util.Scanner;

public class BeeCrowd2416 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int metrosLeo=ent.nextInt(), comprimentoPista = ent.nextInt();
		while(metrosLeo>=comprimentoPista) {
			metrosLeo-=comprimentoPista;
		}
		System.out.println(metrosLeo);
		ent.close();
	}

}
