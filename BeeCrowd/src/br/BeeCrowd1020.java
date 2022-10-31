package br;

import java.util.Scanner;

public class BeeCrowd1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalDias = sc.nextInt(), qtdeAnos,qtdeMeses,qtdeDias;
		qtdeAnos=totalDias/365;
		totalDias%=365;
		qtdeMeses=totalDias/30;
		totalDias%=30;
		qtdeDias=totalDias;
		System.out.println(qtdeAnos+" ano(s)\n"+qtdeMeses+" mes(es)\n"+qtdeDias+" dia(s)");
		

	}

}
