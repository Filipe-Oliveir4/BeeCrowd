package br;

import java.util.Scanner;

public class BeeCrowd1004 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt() , b = entrada.nextInt();
		int PROD;
		PROD = a*b;
		System.out.print("PROD = "+PROD+"\n");
		entrada.close();

	}

}
