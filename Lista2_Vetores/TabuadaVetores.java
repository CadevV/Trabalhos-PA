package prjVetoresBig;

import java.util.Scanner;

public class TabuadaVetores {
	public static void main(String[] args) {
		final int TAM = 5;
		Scanner in = new Scanner(System.in);
		int a[], i, resultado;
		a = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o Numero " + (i + 1));
			a[i] = in.nextInt();
			for(int iTabu = 1; iTabu < 11; iTabu++) {
				resultado = a[i]*iTabu;
				System.out.println(a[i] + "x" + iTabu +" = " + resultado);
			}
		}
		
		in.close();
	}
}
