package br;

import java.util.Scanner;

public class BeeCrowd1012 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double A, B, C;
		A=ent.nextDouble();
		B=ent.nextDouble();
		C=ent.nextDouble();
		double areaTriangulo =(A*C)/2 ;
		System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		double areaCirculo = 3.14159*(C*C);
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		double areaTrapezio = ((A+B)*C)/2;
		System.out.printf("TRAPEZIO: %.3f\n",areaTrapezio);
		double areaQuadrado = B*B ;
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		double areaRetangulo = A*B;
		System.out.printf("RETANGULO: %.3f\n",areaRetangulo);
		
		ent.close();

	}

}
