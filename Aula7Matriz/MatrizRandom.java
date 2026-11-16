import java.util.Random;

public class MatrizRandom {

	public static void main(String[] args) {
		Random in = new Random();
		int m[][] = new int [3][3]; 
		int i, j, vm=0, vp=0, vxm=0, vym=0, vxp=0, vyp=0;
		
		for(i = 0; i<3; i++) {
			for (j = 0; j < 3; j++) {
				m[i][j] = in.nextInt();
				if(i == 0 && j == 0) {
				    vm = m[i][j];
				    vp = m[i][j];
				    
				    vxm = j+1;
				    vym = i+1;
				    vxp = j+1;
				    vyp = i+1;
				}
				
				if(m[i][j] > vm) {
					vm = m[i][j];
					vxm = j+1;
					vym = i+1;
				} 
				
				if(m[i][j] < vp){
					vp = m[i][j];
					vxp = j+1;
					vyp = i+1;
				}
			}
		}
		
		for(i = 0; i<3; i++) {
			System.out.println("");
			for (j = 0; j < 3; j++) {
				System.out.print("["+(m[i][j])+"]");
			}
		}
		
		System.out.println("");
		System.out.println("Maior Valor foi " + vm + " Na posicao X= "+vxm + " Y= " + vym);
		System.out.println("Menor Valor foi " + vp + " Na posicao X= "+vxp + " Y= " + vyp);

	}

}
