import java.util.Scanner;

public class rodizioCase {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		int p;
		
		System.out.println("Entre com os ultimos 2 digitos da sua placa:");
		p = leia.nextInt();
		
		switch(p){
		case 1:
		case 2:
			System.out.println("Proibido na segunda");
			break;
		
			case 3:
			case 4:
				System.out.println("proibido na treça");
				break;
				
			case 5:
			case 6:
				System.out.println("proibido na quarta");
				break;
				
			case 7:
			case 8:
				System.out.println(" proibido na quinta");
				break;
				
			case 9:
			case 0:
				System.out.println("proibido na sexta");
			default:
				System.out.println("Placa invalida");

			
			
		}
	}
}
