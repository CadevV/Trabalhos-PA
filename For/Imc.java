import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, bp = 0, n = 0, sp = 0, o = 0;
		double  p, a, imc;
		
		for(i=1; i<3; i++) {
			System.out.println("Informe sua altura:");
			a = in.nextDouble();
			System.out.println("Informe seu peso:");
			p = in.nextDouble();
			imc = p/(a*a);
			System.out.println("Seu imc é:" +imc);
			
			if(imc < 22) {
				System.out.println("Baixo peso");
				bp++;
			} else if(imc < 27) {
				System.out.println("Normal");
				n++;
			} else if(imc < 29) {
				System.out.println("Sobrepeso");
				sp++;
			} else {
				System.out.println("Obesidade");
				o++;
			}
		}
		System.out.println("Quantidade de pessoas:" +bp+ " Baixo peso," +n+ " Normal," +sp+ "Sobrepeso e " +o+ " Obesidade.");
	}

}
