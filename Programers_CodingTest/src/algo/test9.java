package algo;

import java.util.ArrayList;

public class test9 {

	public static void main(String[] args) {
		int x = 13;
		System.out.println(solution(x));
		
		if(12 % 3 == 0) {
			System.out.println("테스트");
		}
		
	}

	public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        while(true){
            if(x >= 10){
                sum += x % 10;//끝자리 더하고 
                x = x / 10;// 10의자릿수 자름
            }else {
                sum+= x;
                break;
            }
        }
        System.out.println(sum);
        if(sum % x == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
