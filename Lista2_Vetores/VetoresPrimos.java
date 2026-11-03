package prjVetoresBig;

import java.util.Scanner;

public class VetoresPrimos {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], i, veri = 0, index = 0, d = 0, c;
		a = new int[TAM];
		
		for(i = 0; i<TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + " numero da lista");
			a[i] = in.nextInt();
		}
		
		System.out.println("A = [ ");
		for(i = 0; i<TAM; i++) {
			c = a[i];
			d = 0;
			for(index = 0; index<a[i]; index++) {
				veri = a[i]%(c - index);
				if(veri == 0) {
					d++;
				}
			}
			if(a[i] == 2 || a[i]>1 && a[i] % 2 != 0 && d == 2) {
				System.out.println(a[i] + " é numero primo,");
			} else {
				System.out.println(a[i] + " não é primo,");
			}
		}
		System.out.println("]");
		
		in.close();
	}

}
