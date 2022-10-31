package br;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeeCrowd1040 {

	public static void main(String[] args) {
		Scanner ent= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double n1 = ent.nextFloat(),n2 = ent.nextFloat(),n3 = ent.nextFloat(), n4 = ent.nextFloat();
		double media,notaExame,mediaExame;
		media=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		System.out.println("Media: " + df.format(media));
		if(media>=7)
			System.out.println("Aluno aprovado.");
		if(media<5){
			System.out.println("Aluno reprovado.");}
		if(media>=5&&media<7) {
			System.out.println("Aluno em exame.");
			notaExame=ent.nextFloat();
			System.out.println("Nota do exame: "+df.format(notaExame));
			mediaExame=(notaExame+media)/2;
			if(mediaExame>=5) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: "+df.format(mediaExame));
			}else{
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: "+df.format(mediaExame));}
		}
		ent.close();

	}

}
