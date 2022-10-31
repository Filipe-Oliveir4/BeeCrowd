package br;

import java.util.Scanner;

public class BeeCrowd1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),fatorial=1;
		int auxiliar=0,cont=0;
		System.out.println(fatorial);
		while(n>0) {
			fatorial=fatorial*(fatorial+1);
			fatorial=auxiliar;
			if(n-fatorial<0) {
				n=n-fatorial;
				fatorial=1;
				cont++;
			}
			System.out.println(fatorial);
			}
		
		System.out.println(cont);
		}

	}


