import java.util.Scanner;


public class lanche {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in );
		int c; 
		
		System.out.println("Insira o código do lanche:");
		c = leia.nextInt(); 
		
		switch(c){ 
		case 1: 
			System.out.println("Cachorro quente R$ 8,00");
			break;
			
		case 2:
			System.out.println("Cheeseburger R$ 12,00");
		break; 
		
		case 3:
			System.out.println("X-salada R$ 15,00"); 
			break;
			
		case 4:
			System.out.println("Misto quente R$ 11,00"); 
			break;
			
		case 5: 
			System.out.println("Pão na chapa R$ 6,00");
			break;
			
		default: 
			System.out.println("Código invalido");
			
		}
		leia.close();

	}

}
