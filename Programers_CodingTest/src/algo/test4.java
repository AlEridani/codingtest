package algo;

public class test4 {
	public static void main(String[] args) {
			String str = "01033334444";
			System.out.println(solution(str));
				
	}

	public static String solution(String phone_number) {
		String answer = "";
		char[] ch = phone_number.toCharArray();
		for(int i =0; i < ch.length;i++) {
			if(i > ch.length-5) {
				answer+=ch[i];
			}else {
				answer+="*";
			}
		}
		
		return answer;
	}
}
