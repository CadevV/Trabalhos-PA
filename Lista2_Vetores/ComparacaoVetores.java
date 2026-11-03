package prjVetoresBig;

import java.util.Scanner;

public class ComparacaoVetores {
	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		System.out.println("Entre com os valores de A: ");
		for(i = 0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("Entre com os valores de B: ");
		for(i = 0; i<TAM; i++) {
			b[i] = in.nextInt();
		}
		
		System.out.print("C = [");
		for(i = 0; i<TAM; i++) {
			if(a[i] > b[i]) {
				c[i] = 1;
			} else if(a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
			}
			
			System.out.print(c[i] + " ");
		}
		System.out.println("]");
		
		in.close();
	}

}
