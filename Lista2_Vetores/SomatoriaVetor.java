package prjVetoresBig;

import java.util.Scanner;

public class SomatoriaVetor {
	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], b[], i, index, soma;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + " numero da lista");
			a[i] = in.nextInt();
		}
		
		for(i = 0; i < TAM; i++) {
			soma = 0;
			for(index = i; index < TAM; index++) {
				soma = soma + a[index];
			}
			b[i] = soma;
		}
		
		System.out.print("A = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("B = [");
		for(i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		
		in.close();
	}
}