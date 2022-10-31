package br;

import java.util.Scanner;

public class BeeCrowd2936 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);	
		final int DONACHICA = 225, PORCAOCURUPIRA = 300, 
				PORCAOBOITATA=1500, PORCAOBOTO = 600,PORCAOMAPINGUARI=1000,PORCAOIARA=150;
		int curupira = ent.nextInt(),
			boitata=ent.nextInt(),
			boto=ent.nextInt(),
			mapinguari=ent.nextInt(),
			iara=ent.nextInt(),
			total;
		curupira*=PORCAOCURUPIRA;
		boitata*=PORCAOBOITATA;
		boto*=PORCAOBOTO;
		mapinguari*=PORCAOMAPINGUARI;
		iara*=PORCAOIARA;
		total=curupira+boitata+mapinguari+iara+boto+DONACHICA;
		System.out.println(total);
		ent.close();
		
	}

}
