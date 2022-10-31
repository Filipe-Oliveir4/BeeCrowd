package br;

import java.util.Scanner;

public class BeeCrowd2791 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int resultado=0;
		int[] c = new int[4];
		for (int i = 0; i < c.length; i++) {
			c[i]=ent.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			resultado = c[i]==1? i+1:resultado;
		}
		System.out.println(resultado);
		ent.close();
	}

}
