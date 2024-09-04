package Logic;

public class Factorial {

	public static void main(String[] args) {
		int n=5,s=1;
		
		for(int i=1;i<=n;i++) {
			s*=i;
			
		}
		
		System.out.println("Factorial of given number is ->"+s);
		
		
	}

}
