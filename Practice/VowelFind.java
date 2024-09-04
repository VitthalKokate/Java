package Logic;

public class VowelFind {
	
	public static void main(String[] args) {
		
		String str="Apple";
		String v="aeiou";
		String str1 = "";
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<v.length();j++) {
				
				if (str.charAt(i)==v.charAt(j)) {
					System.out.println(str.charAt(i));
					
				}else
					str1+=str.charAt(i);
			}
		}
		
			
			
	}

}
