package prjVetoresBig;

import java.util.Scanner;

public class SearchVetor {

	public static void main(String[] args) {
		final int TAM = 10;
		Scanner in = new Scanner(System.in);
		int a[], i, r, p = 0;
		String resposta = "";
		a = new int[TAM];
		
		System.out.println("Entre com os Numeros: ");
		for(i = 0; i<TAM; i++) {
			a[i] = in.nextInt();
		}
		
		do {
			p = 0;
			System.out.println("Entre com o numero da Consulta: ");
			r = in.nextInt();
			
			for(i = 0; i<TAM; i++) {
				if(r == a[i]) {
					p++;
				}
			}
			
			if(p > 0) {
				System.out.println(r + " Aparece " + p + " Vezes na lista");
			} else {
				System.out.println(r + " Nao Aparece na lista");
			}
			
			System.out.println("Fazer outra consulta? (S/N)");
			resposta = in.next();
		} while (resposta.trim().toUpperCase().equals("S"));
		
		in.close();
	}

}
