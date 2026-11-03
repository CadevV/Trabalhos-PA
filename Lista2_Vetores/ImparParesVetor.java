package prjVetoresBig;

import java.util.Scanner;

public class ImparParesVetor {

	public static void main(String[] args) {
		final int TAM = 20;
		Scanner in = new Scanner(System.in);
		int a[], b[], index = 0, i = 0;
		
		a = new int[TAM];
		b = new int[TAM];
		
		System.out.println("Entre com os inteiros: ");
		for(i = 0; i < TAM; i++) {
			a[i] = in.nextInt();
			
			if(a[i] % 2 == 0) {
				b[index] = a[i];
				index++;
			}
		}
		
		for(i = 0; i < TAM; i++) {
			if(a[i] % 2 != 0) {
				b[index] = a[i];
				index++;
			}
		}
		
		System.out.print("A = [");
		for(i = 0; i<TAM; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println("]");
		
		System.out.print("B = [");
		for(i = 0; i<TAM; i++) {
			System.out.print(b[i]+", ");
		}
		System.out.println("]");
		
		in.close();
	}

}
