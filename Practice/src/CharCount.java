
public class CharCount {
	static String s = "Abcksadjsdiqwio12134832jdsnkcfnskdnkjqhw8e8";
	 
	public static void main(String[] args){
		String str = s.replaceAll("[1-9]","");
		int count[] = new int[10];
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='A'){
				count[0]++;
			}
			if(str.charAt(i)=='b'||str.charAt(i)=='B'){
				count[1]++;
			}
			
			
			
			
		}
		 System.out.println("a和A的个数："+count[0]);
		 System.out.println("b和B的个数："+count[1]);
		 System.out.println(str);
	}

}
