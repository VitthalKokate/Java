package Logic;

public class SwapWithoutOPER {

	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("Swaping before A->"+a+" B->"+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("Swaping After A->"+a+" B->"+b);

	}

}
