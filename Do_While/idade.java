import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 0, an, ans, id; String resposta;
		
		do {
		System.out.println("Insira o ano atual:");
		an = leia.nextInt();
		
		System.out.println("Insira o seu ano de nascimento:");
		ans = leia.nextInt();
		
		id = an - ans;
		
		if(id < 18) {
			System.out.println("Você é menor de idade.");
		}
		
		else {
			System.out.println("Você é maior de idade.");
		}
		i++;
		i = 0;
		System.out.println("Deseja continuara a execução? S para sim e N para não.");
		resposta = leia.next();
		}while(resposta.equalsIgnoreCase("s"));
		
	}
	

}
