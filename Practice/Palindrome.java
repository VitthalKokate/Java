package Logic;
// 121 -> reverse ->121 is palindrome number
public class Palindrome {

	public static void main(String[] args) {
		
		int n=121;
		int r,s=0,c=n;
		
		while(n>0) {
			r=n%10;
			s=(s*10)+r;// Its reverse logic
			n=n/10;
		}
		
		if(c==s)
			System.out.println("Given number is Palindrome number ->"+s);
		else
			System.out.println("Given number is NOT Palindrome number ->"+s);
			
		

	}

}
