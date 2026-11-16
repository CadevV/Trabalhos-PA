public class Matriz4x4 {

	public static void main(String[] args) {
		int v[][] = new int[4][4];
		int i=0, j=0, n;
		
		v[i][j] = 2;
		n = v[i][j];
		
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				v[i][j] = n * 2;
				v[0][0] = 2;
				n = v[i][j];
			}
		}
		
		for(i=0; i<4; i++) {
			System.out.println();
			for(j=0; j<4; j++) {
				System.out.print("[ "+v[i][j]+" ]");
			}
		}
	}

}
