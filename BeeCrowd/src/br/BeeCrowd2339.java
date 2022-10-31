package br;

import java.util.Scanner;

public class BeeCrowd2339 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int competidores=ent.nextInt(),folhasCompradas=ent.nextInt(),folhasCompetidor=ent.nextInt();
		System.out.println(competidores*folhasCompetidor<=folhasCompradas?"S":"N");
		ent.close();
	}

}
