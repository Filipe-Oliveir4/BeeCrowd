package br;

import java.util.Scanner;

public class BeeCrowd1933 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a =ent.nextInt(), b = ent.nextInt(),melhorCarta;
		if(a==b)
			melhorCarta=a;
		else if(a>b)
			melhorCarta=a;
		else
			melhorCarta=b;
		System.out.println(melhorCarta);
		ent.close();
	}

}
