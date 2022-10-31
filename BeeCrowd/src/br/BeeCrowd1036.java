package br;

import java.util.Scanner;

public class BeeCrowd1036 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double a,b,c,delta,r1,r2;
		a=ent.nextDouble();
		b=ent.nextDouble();
		c=ent.nextDouble();
		delta=(b*b)-((4*a)*c);
		if(delta>0&&a>0&&b>0) {
			r1=(-b+Math.sqrt(delta))/(2*a);
			r2=(-b-Math.sqrt(delta))/(2*a);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n",r1,r2);}
		else
			System.out.println("Impossivel calcular");
		ent.close();
	}

}
