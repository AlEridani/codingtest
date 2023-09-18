package algo;

import java.util.HashMap;

public class test3 {

	public static void main(String[] args) {
		String[] arr = {"leo", "kiki", "eden"};
		String[] arr2 = {"eden", "kiki"};
		String result = solution(arr,arr2);
		System.out.println(result);
		

	}

	public static  String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        //해시맵에 넣는다 완주자랑 비교하고 하나씩 뺸다 남은거 리턴하다
        for(String x : participant) {
        	map.put(x, map.getOrDefault(x, 0) + 1);
        	
        }
        
        for(String x : completion) {
        	if(map.containsKey(x)){
        		int count = map.get(x);
        		if(count >1) {
        			System.out.println(x);
        			map.put(x, map.getOrDefault(x, count)-1);
        		}else {
        			System.out.println(x);
        			map.remove(x);
        		}
        	}
        }
        for(String x : map.keySet()) {
        	answer = x;
        }
        
        
        return answer;
    }
}
