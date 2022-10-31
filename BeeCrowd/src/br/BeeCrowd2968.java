package br;

import java.util.Scanner;

public class BeeCrowd2968 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVoltas = sc.nextShort(), numPlacas = sc.nextShort();
		double resultado;
		float total = numVoltas*numPlacas;
		
		for(int i=1;i<=9;i++){
			resultado= Math.ceil((total/10)*i);
			int m = (int)resultado;
			System.out.print(m+" ");
		}
		System.out.println();
		sc.close();

	}

}
