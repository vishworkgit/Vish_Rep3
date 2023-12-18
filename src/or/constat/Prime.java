package or.constat;

public class Prime {
	public static boolean isprime(int i) {
		
		if(i<=1) {
			return false;
		}
		for(int j=2;j<=Math.sqrt(i);j++) {
			if((i%j)==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {

        for(int i=0;i<=10;i++) {
        	if(isprime(i)) {
        		System.out.println(i);
        	}
        	
        	
        }


	}

}
