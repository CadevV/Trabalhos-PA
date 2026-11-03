package prjVetoresBig;

import java.util.Scanner;

public class ConversaoPares {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		System.out.println("Entre com os valor de A: ");
		for(i = 0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.print("B = [");
		for(i = 0; i<TAM; i++) {
			if(a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
			
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		
		in.close();
	}

}
