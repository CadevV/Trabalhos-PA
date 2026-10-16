import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0, b = 0, ai, af;
		
		System.out.println("Insira ano inicial:");
		ai = in.nextInt();
		System.out.println("Insira ano final:");
		af = in.nextInt();
		
		for(i = ai; i < af; i ++) {

			if(i %4 == 0 ) {
				if(i %400 != 0 )
				{
				System.out.println("Ano bissexto");
				System.out.println(i);
				b++;
				}
			}else if(i %100 == 0) {
			    if(i % 400 == 0) {
			    	b++;
			    }
			}
		}
		
		System.out.println(b);
	}

}
