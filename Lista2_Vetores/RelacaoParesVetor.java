package prjVetoresBig;

import java.util.Scanner;

public class RelacaoParesVetor {
	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], i, index;
		a = new int[TAM];
		
		System.out.println("Entre com os numeros");
		for(i = 0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("A = [");
		for(i = 0; i<TAM; i++) {
			System.out.print(a[i] + " (");
			for(index = 0; index<=a[i]; index+=2) {
				System.out.print(index + ", ");
			}
			System.out.println(")");
		}
		System.out.println("]");
		
		in.close();
	}
}
