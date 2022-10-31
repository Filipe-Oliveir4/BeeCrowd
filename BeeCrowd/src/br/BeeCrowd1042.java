package br;

import java.util.Scanner;

public class BeeCrowd1042 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int[] vetorA= new int[3];
		int[] vetorB=new int[3];
		for (int i = 0; i < 3 ; i++) {
			vetorA[i]=ent.nextInt();
			vetorB[i]=vetorA[i];
		}
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorA.length; j++) {
				if(vetorA[i]<vetorA[j]) {
					int auxiliar = vetorA[i];
					vetorA[i]=vetorA[j];
					vetorA[j]=auxiliar;
				}
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
		ent.close();

	}

}
