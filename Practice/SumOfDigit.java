package Logic;

//153 -> sumof digits 1+5+3 =9
public class SumOfDigit {

	public static void main(String[] args) {
		
		int n=153,s=0;
		
		while(n>0) {
			int r=n%10;
			s+=r;
			n=n/10;
		}
		
		System.out.println("Sum of Digit is ->"+s);
		
		
	}

}
