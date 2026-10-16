import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 1, d, a;
		
		while(i<7) {
			System.out.println("Inseira sua data de nascimento:");
			d = leia.nextInt();
			a = 2026 - d;
			System.out.println("sua idade é:" +a );
			i++;
		}
	}

}
