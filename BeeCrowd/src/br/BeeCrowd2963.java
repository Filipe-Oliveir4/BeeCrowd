package br;

import java.util.Scanner;

public class BeeCrowd2963 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char passou='S';
		int numCandidatos = sc.nextInt();
		int carlos= sc.nextInt();
		for (int i = 0; i <numCandidatos-1 ; i++) {
			int outro= sc.nextInt();
			if(outro>carlos) {
				passou='N';
			}}
		System.out.println(passou);
	}

}
