package lambda;

public class IfDemoImpl {

	public static void main(String[] args) {
		
		IfDemo i=(n)->{if(n>10) return n*n; else return n*n*n; };
		
		System.out.println(i.oddOrEven(10));
	}

}
