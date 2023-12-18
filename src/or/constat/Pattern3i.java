package or.constat;

public class Pattern3i {

	public static void main(String[] args) {
		int n=5;

		for (int i = 0; i < n; i++) {

			int j=n-i;
			while(j>1) {
				System.out.print(" ");
				j--;
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}
}
