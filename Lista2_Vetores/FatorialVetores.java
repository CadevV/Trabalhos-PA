package prjVetoresBig;

import java.util.Scanner;

public class FatorialVetores {

    public static void main(String[] args) {
        final int TAM = 15;
        Scanner in = new Scanner(System.in);
        int a[], b[], i, index, r;
        
        a = new int[TAM];
        b = new int[TAM];
        
        for(i = 0; i < TAM; i++) {
            a[i] = in.nextInt();
        }
        
        for(i = 0; i < TAM; i++) {
            r = 1;
            
            if(a[i] > 0) {
                for(index = 1; index <= a[i]; index++) {
                    r = r * index;
                }
            }
            
            b[i] = r;
            
            System.out.println("B[" + (i+1) + "]" + "=" + b[i]);
        }
        
        in.close();
    }
}