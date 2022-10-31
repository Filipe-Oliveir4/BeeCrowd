package br;

import java.util.Scanner;

public class BeeCrowd1153 {

	public static void main(String[] args) {
		int fatorial, resposta=1;
		Scanner entrada = new Scanner(System.in);
		fatorial = entrada.nextInt();
		entrada.close();
		for(;fatorial>=1;fatorial--){
			resposta*=fatorial;
			}
		
		System.out.println(resposta);
		
	}

}
