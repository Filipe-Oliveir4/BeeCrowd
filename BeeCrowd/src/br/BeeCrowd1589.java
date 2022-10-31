package br;

import java.util.Scanner;

public class BeeCrowd1589 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numRepeticoes=ent.nextInt(), r2, r1;
		for (int i = 0; i < numRepeticoes; i++) {
			r1=ent.nextInt();
			r2=ent.nextInt();
			System.out.println(r1+r2);
			}
		ent.close();
	}

}
