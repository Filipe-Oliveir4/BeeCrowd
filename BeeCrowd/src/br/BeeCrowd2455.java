package br;

import java.util.Scanner;

public class BeeCrowd2455 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		byte p1 = ent.nextByte(),c1 = ent.nextByte(),p2 = ent.nextByte(),c2 = ent.nextByte();
		if(p1*c1==p2*c2) {
			System.out.println(0);
		}else if(p1*c1>p2*c2) {
			System.out.println(-1);
		}else
			System.out.println(1);		
		ent.close();
	}

}
