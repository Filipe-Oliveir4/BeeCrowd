package br;

import java.util.Scanner;

public class BeeCrowd1021 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double dinheiro = ent.nextDouble();
		double nota100,nota50, nota20, nota10, nota5, nota2,umReal,cinquentaCent,vinte5Cent,dezCent,cincoCent,centavos;
		nota100=dinheiro/100;
		dinheiro%=100;
		
		nota50=dinheiro/50;
		dinheiro%=50;
		
		nota20=dinheiro/20;
		dinheiro%=20;
		
		nota10=dinheiro/10;
		dinheiro%=10;
		
		nota5=dinheiro/5;
		dinheiro%=5;
		
		nota2=dinheiro/2;
		dinheiro%=2;
		
		dinheiro*=100;
		
		umReal=dinheiro/100;
		dinheiro%=100;
		
		cinquentaCent=dinheiro/50;
		dinheiro%=50;
		
		vinte5Cent=dinheiro/25;
		dinheiro%=25;
		
		dezCent=dinheiro/10;
		dinheiro%=10;
		
		cincoCent=dinheiro/5;
		dinheiro%=5;
		
		centavos=dinheiro;
		System.out.println("NOTAS:\n"+
				(int)nota100+" nota(s) de R$ 100.00\n"+
				(int)nota50+" nota(s) de R$ 50.00\n"+
				(int)nota20+" nota(s) de R$ 20.00\n"+
				(int)nota10+" nota(s) de R$ 10.00\n"+
				(int)nota5+" nota(s) de R$ 5.00\n"+
				(int)nota2+" nota(s) de R$ 2.00\n"+
				"MOEDAS:\n"+
				(int)umReal+" moeda(s) de R$ 1.00\n"+
				(int)cinquentaCent+" moeda(s) de R$ 0.50\n"+
				(int)vinte5Cent+" moeda(s) de R$ 0.25\n"+
				(int)dezCent+" moeda(s) de R$ 0.10\n"+
				(int)cincoCent+" moeda(s) de R$ 0.05\n"+
				(int)centavos+" moeda(s) de R$ 0.01");
		ent.close();

	}

}
