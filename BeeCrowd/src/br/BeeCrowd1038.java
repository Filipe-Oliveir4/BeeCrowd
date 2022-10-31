package br;

import java.util.Scanner;

public class BeeCrowd1038 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String linha = ent.nextLine();
		byte produto = Byte.parseByte(linha.substring(0,1));
		int quantidade = Integer.parseInt(linha.substring(2,3));
		double valor=0;
		switch(produto) {
		case 1:
			valor=quantidade*4.00;
			break;
		case 2:
			valor=quantidade*4.50;
			break;
		case 3:
			valor=quantidade*5.00;
			break;
		case 4:
			valor=quantidade*2;
			break;
		case 5:
			valor=quantidade*1.50;
			break;
		}
		System.out.printf("Total: R$ %.2f", valor);
		
		ent.close();
	}

}
