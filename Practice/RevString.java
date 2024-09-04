package Logic;

public class RevString {

	public static void main(String[] args) {
		String s="JAVA",s2 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		System.out.println(s2);

	}

}
