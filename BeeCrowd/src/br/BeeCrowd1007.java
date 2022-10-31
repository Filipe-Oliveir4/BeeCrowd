package br;

import java.util.Scanner;

public class BeeCrowd1007 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int A = ent.nextInt();
		int B = ent.nextInt();
		int C = ent.nextInt();
		int D = ent.nextInt();
		int diferenca = (A*B)-(C*D) ;
		System.out.println("DIFERENCA = "+ diferenca);
		ent.close();
	}

}
