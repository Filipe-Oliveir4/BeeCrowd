package br;

import java.util.Scanner;

public class BeeCrowd1005 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		
		double media = (A*3.5+B*7.5)/11;
		System.out.printf("MEDIA = %.5f",media);
		
		entrada.close();

	}

}
