
public class numerosImpares {

	public static void main(String[] args) {
		int i = 0, s = 0;
		
		do {
			if(i % 2 != 0) {
				s = (s + i);
			}
			i++;
		}while(i < 1001);
		System.out.println(s);
		
		
	}

}
