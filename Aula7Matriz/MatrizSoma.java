import java.util.Scanner;

public class MatrizSoma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v[][] = new int[3][4];
		int i, j, c;

		for(i=0; i<3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Entre com numero inteiro");
				v[i][j] = in.nextInt();
			}
		}
		
		for(i=0; i< 3; i++) {
			c = 0;
			for (j = 0; j < 3; j++) {
				c += v[i][j];
				v[i][3] = c;
			}
		}
		
		for(i=0; i<3; i++) {
			System.out.println("");
			for (j = 0; j < 4; j++) {
				System.out.print("[ "+v[i][j]+" ]");
			}
		}
		
		in.close();
	}

}
