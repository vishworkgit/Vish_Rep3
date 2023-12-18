package or.constat;

public class ConditionalStatement {
	
	public void stat() {
		int a=40,b=50,c=600;
		if(a>b && a>c){
			
			System.out.println("A is Greater");
			
		}
		else if(b>c && b>a) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}
	
	public void stat1() {
		int a,b,c;
	}
	
	public static void main(String[] args) {
		ConditionalStatement c=new ConditionalStatement();
		c.stat();
	}

}
