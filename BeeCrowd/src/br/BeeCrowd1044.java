package br;

import java.util.Scanner;

public class BeeCrowd1044 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a =ent.nextInt(),b= ent.nextInt();
		if(a%b==0||b%a==0) {
			System.out.println("Sao Multiplos");
		}
		else
			System.out.println("Nao sao Multiplos");
		ent.close();
	}

}
