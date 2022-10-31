package br;

import java.util.Scanner;

public class BeeCrowd1157 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		for(int x = 1;x<=n;x++) {
			if(n%x==0) {
				System.out.println(x);
			}
		}
		ent.close();

	}

}
