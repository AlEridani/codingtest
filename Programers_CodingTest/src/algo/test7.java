package algo;

import java.util.HashSet;
import java.util.Set;

public class test7 {

	public static void main(String[] args) {
		int[] arr = {3,1,2,3};
		System.out.println(solution(arr));
	}
	 public static int solution(int[] nums) {
	        int answer = 0;
	        Set<Integer> set = new HashSet<>();
	        
	        for(Integer x : nums) {
	        	set.add(x);
	        }
	        int size = set.size();
	        if(nums.length/2 > size) {
	        	answer = size;
	        }else {
	        	answer = nums.length/2;
	        }
	        
	        return answer;
	    }
}
