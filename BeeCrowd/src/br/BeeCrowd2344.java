package br;

import java.util.Scanner;

public class BeeCrowd2344 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int valotNota=ent.nextInt(); 
		if(valotNota==0) {
			System.out.println("E");
		}else if(valotNota>=1 && valotNota<=35) {
			System.out.println("D");
		}else if(valotNota>=36 && valotNota<=60) {
			System.out.println("C");
		}else if(valotNota>=61 && valotNota<=85) {
			System.out.println("B");
		}else if(valotNota>=86 && valotNota<=100) {
			System.out.println("A");
		}
		ent.close();
	}

}
