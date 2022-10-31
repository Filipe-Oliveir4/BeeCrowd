package br;

import java.util.Scanner;

public class BeeCrowd3055 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, media;
		a = entrada.nextInt();
		media = entrada.nextInt();
		b=media*2-a;
		System.out.println(b);
		entrada.close();

	}

}
