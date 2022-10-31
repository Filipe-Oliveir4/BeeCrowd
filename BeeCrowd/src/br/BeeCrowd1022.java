package br;

import java.util.Scanner;

public class BeeCrowd1022 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int d=0, n=0, d1, n1, d2, n2, repeticoes;
		repeticoes = ent.nextInt();
		String operacao;
		String linha;
		linha=ent.nextLine();
		String[] dados = linha.split(" ");
		for (int i = 0; i < repeticoes; i++) {
			n1=Integer.parseInt(dados[0]);
			d1=Integer.parseInt(dados[2]);
			operacao= dados[3];
			n2=Integer.parseInt(dados[4]);
			d2=Integer.parseInt(dados[6]);
			System.out.println(n1+n2);
			if(operacao.equals("+")) {
				n=n1*d2 + n2*d1;
				d=d1*d2;
			}else if(operacao.equals("-")) {
				n=n1*d2 - n2*d1;
				d=d1*d2;
			}else if(operacao.equals("*")) {
				n=n1*n2;
				d=d1*d2;
			}else if(operacao.equals("/")) {
				n=n1*d2;
				d=n2*d1;
			}
			
			System.out.println(n+" "+d);
		}


		ent.close();
	}
	

	}

