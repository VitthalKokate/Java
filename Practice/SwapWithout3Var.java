package Logic;

public class SwapWithout3Var {

	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("Before Swap A->"+a+" B-> "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap A->"+a+" B-> "+b);
		
		

	}

}
