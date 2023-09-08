package algo;

public class algo {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = 1;
		System.out.println(solution(str, n));
		
	}

	public static String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				answer += ' ';
			} else if(ch>= 65 && ch <=90 && (char) (ch + n)>90){
				answer += (char) (((ch + n)%90) + 64);
			}else if(ch>= 97 && ch <=122 && (char) (ch + n)>122){
				answer += (char) (((ch + n)%122) + 96);
			}else {
				answer += (char) (ch + n);
				
			}
		}

		return answer;
	}
}
