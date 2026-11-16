
import java.util.Random;

public class MatrizBingo {

    public static void main(String[] args) {
        //A Atividade mais divertida de PA ate agora desde o inicio do ano
        Random in = new Random();
        int v[][] = new int[4][4];
        int i, j, n, nm, t=0, m=0, mr = 0;
        boolean r = true, rm = true;


		for(i = 0; i<4; i++) {
		    for(j = 0; j<4; j++) {
		        nm = in.nextInt(75) + 1;
		        rm = true;
		
		        while(rm == true) {
		            rm = false;
		
		            for(int x = 0; x<4; x++) {
		                for(int y = 0; y<4; y++) {
		                    if(nm == v[x][y]) {
		                        nm = in.nextInt(75) + 1;
		                        rm = true;
		                    }
		                }
		            }
		        }
		
		        v[i][j] = nm;
		    }
		}


        System.out.println("Sua Cartela De Bingo:");
        for(i=0; i<4; i++) {
            System.out.println("");
            for (j = 0; j < 4; j++) {
                System.out.print("[ "+v[i][j]+" ]");
            }
        }
        System.out.println("");

        while (r == true){
            n = in.nextInt() % 76;

            while (n <= 0) {
                n = in.nextInt() % 76;
            }

            System.out.println("Numero Cantado " + n);

            mr = m;

            for(i = 0; i<4; i++) {
                for(j = 0; j<4; j++) {
                    if(v[i][j] == n) {
                        m++;
                        v[i][j] = 0;
                        System.out.println("Numero Marcado Na Cartela");

                        if(m == 16) {
                            r = false;
                        }
                    }
                }
            }

            if(mr == m) {
                System.out.println("Numero Nao esta na Cartela");
            }

            System.out.println("");

            t++;
        }

        System.out.println("BINGO!!!!!");
        System.out.println("Apos " + t + " Tentativas a Cartela foi prenchida");
    }
}
