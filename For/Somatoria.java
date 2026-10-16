import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i = 0, n = 0, en = 0, vt = 0;
		
		System.out.println("Insira o número de sua escolha:");
		n = in.nextInt();
		
		for(i = 0; i < n; i++) {
			System.out.println(en);
			en = en + 1;
			vt = vt + en;
		}
		System.out.println(vt);
	}

}
