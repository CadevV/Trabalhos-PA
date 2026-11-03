package prjVetoresBig;

public class PotenciaVetor {

    public static void main(String[] args) {
        final int TAM = 11; 
        int a[], i, r = 1; 
        a = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            a[i] = r;
            r = r * 2;
        }
        
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }
}