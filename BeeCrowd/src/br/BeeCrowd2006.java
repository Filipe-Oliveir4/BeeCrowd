package br;

import java.util.Scanner;

public class BeeCrowd2006 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numAcertos = 0, tipoCha, A, B, C, D, E;	
		String cha = ent.nextLine();
		tipoCha = Integer.parseInt(cha);
		String linha = ent.nextLine();
		String[] escolhaCompetidores = linha.split(" ");
		A = Integer.parseInt(escolhaCompetidores[0]);
		B = Integer.parseInt(escolhaCompetidores[1]);
		C = Integer.parseInt(escolhaCompetidores[2]);
		D = Integer.parseInt(escolhaCompetidores[3]);
		E = Integer.parseInt(escolhaCompetidores[4]);
		
		if(A==tipoCha) {
			numAcertos++;
		}
		if(B==tipoCha) {
			numAcertos++;
		}
		if(C==tipoCha) {
			numAcertos++;
		}
		if(D==tipoCha) {
			numAcertos++;
		}
		if(E==tipoCha) {
			numAcertos++;
		}
		System.out.println(numAcertos);
		ent.close();
	}

}
