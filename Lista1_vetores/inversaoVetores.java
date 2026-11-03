package prjVetores;

import java.util.Scanner;

public class inversaoVetores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[],b[], i;
		a = new int[TAM];
		b = new int[TAM];		
				
		for(i = 0; i<TAM ;i++) {
			System.out.println("Entre com os numeros do vetor A" + (i+1));
			a[i] = in.nextInt();
		}
		
		System.out.println("Valores A e B");
		
		System.out.print("a[");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+ ", ");
		}
		System.out.println("]");
		
		System.out.print("b[");
		for(i=0;i<TAM; i++) {
			b[i] = a[TAM - (i+1)];
			System.out.print(b[i]+", ");
		}
		System.out.println("]");
		
		in.close();
	}

}
