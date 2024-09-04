package Logic;

public class FiboSeris {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,c;
		System.out.print(a+"\t"+b);
		for(int i=0;i<n;i++) {
			c=a+b;
			System.out.print("\t"+c);
			a=b;
			b=c;
		}

	}

}
