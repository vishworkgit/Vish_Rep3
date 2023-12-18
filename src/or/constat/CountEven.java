package or.constat;

public class CountEven {
	

	public static void main(String[] args) {
		
		int j=0;
		for(int i=0;i<=100;i++) {
			
			if(i%2==0) {
				j=j+i;
			}
			
		}
		System.out.println("The Count of Even numbers from 1 to 100--> "+j);
	}

}
