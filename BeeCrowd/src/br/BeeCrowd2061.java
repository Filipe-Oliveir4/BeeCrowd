package br;

import java.util.Scanner;

public class BeeCrowd2061 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numAbas=ent.nextInt(),numAcoes = ent.nextInt();
		for (int i = 0; i <= numAcoes; i++) {
			String acao = ent.nextLine();
			if(acao.equals("fechou")) {
				numAbas+=1;
			}else if(acao.equals("clicou")){
				numAbas-=1;
			}
		}
		System.out.println(numAbas);
		ent.close();
	}

}
