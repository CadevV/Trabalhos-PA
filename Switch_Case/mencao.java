import java.util.Scanner;


public class mencao {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in );
		String m; 
		
		System.out.println("Insira a menção:");
		m = leia.next();
		
		switch(m){ 
		case "MB": 
			System.out.println("Excelente desempenho");
			break
			
			;case "B": System.out.println("Bom desempenho"); 
			break;
			
			case "R": 
				System.out.println("Desempenho  regular");
				break;

			case "I":
				System.out.println("Desempenho irregular");
				break;
				default:
					System.out.println("Menção inválida");
					}
		leia.close();

	}

}
