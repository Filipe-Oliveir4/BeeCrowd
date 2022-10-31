package br;

import java.util.Scanner;

public class BeeCrowd1035 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a = ent.nextInt(),b = ent.nextInt(),c = ent.nextInt(),d = ent.nextInt();
		int ab=a+b;
		int cd=c+d;
		if(a%2==0) {
			if(ab>0&&cd>0) {
				if(b>c&&d>a&&c+d>a+b) {
					System.out.println("Valores aceitos");
				}else
					System.out.println("Valores nao aceitos");}
			else
				System.out.println("Valores nao aceitos");}
		else
			System.out.println("Valores nao aceitos");
		ent.close();

	}

}
