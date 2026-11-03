package prjVetoresBig;

import java.util.Scanner;

public class PalindromoVetor {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], i, o = 0, indiceFinal;
		a = new int[TAM];

		for(i = 0; i < TAM; i++) {
			a[i] = in.nextInt();
		}
		
		for(i = 0; i < TAM / 2; i++) {
			indiceFinal = TAM - 1 - i;
			if(a[i] != a[indiceFinal]) {
				o++;
			}
		}
		
		if(o > 0) {
			System.out.println("A lista informada não é um palindromo");
		} else {
			System.out.println("A lista Informada é um palindromo");
		}
		
		in.close();
	}

}
