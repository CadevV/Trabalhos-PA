package prjVetoresBig;

import java.util.Scanner;

public class RelacaoDiviVetor {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], i, result = 0;
		a = new int[TAM];
		
		System.out.println("Entre com os Valores");
		for(i = 0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		for(i = 0; i<TAM; i++) {
			System.out.print(a[i] + "(");
			for(int index = 1; index<=a[i]; index++) {
				result = index;
				if(result != 0 && a[i] % result == 0) {
					System.out.print(result + " ");
				}
			}
			System.out.println(")");
		}
		
		in.close();
	}

}
