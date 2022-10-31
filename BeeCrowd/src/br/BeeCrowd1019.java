package br;

import java.util.Scanner;

public class BeeCrowd1019 {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int n = ent.nextInt();
		int horas = n / 3600;
		int minutos = (n % 3600) / 60;
		int segundos = (n % 3600) % 60;
		System.out.println(horas+":"+minutos+":"+segundos);
		ent.close();	

	}

}
