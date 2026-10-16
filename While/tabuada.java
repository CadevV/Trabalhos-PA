import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 1, n, t;
		
		System.out.println("Insira o número da tabuada:");
		n = leia.nextInt();
		while(i<11) {
			t = (n * i);
			System.out.println(+t);
			i++;
		}
	}
	
}
