package prjVetoresBig;

import java.util.Scanner;

public class IntersecaoVetores {
    public static void main(String[] args) {
        final int TAM = 10;
        Scanner in = new Scanner(System.in);
        int a[], b[], c[], i, index, j, indexC = 0, repetido;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for(i = 0; i < TAM; i++) {
            System.out.println("Entre com o numero de A");
            a[i] = in.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            System.out.println("Entre com o numero de B");
            b[i] = in.nextInt();
        }

        for(i = 0; i < TAM; i++) {
            for(index = 0; index < TAM; index++) {
                if(a[i] == b[index]) {
                    repetido = 0;

                    for(j = 0; j < indexC; j++) {
                        if(a[i] == c[j]) {
                            repetido++;
                        }
                    }

                    if(repetido == 0) {
                        c[indexC] = a[i];
                        indexC++;
                    }
                }
            }
        }

        System.out.print("C = [");
        for(i = 0; i < indexC; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println("]");

        in.close();
    }
}
