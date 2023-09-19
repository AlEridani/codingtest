package algo;

import java.util.Stack;

public class test6BFS {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(arr, target));
	}

	public static int solution(int[] numbers, int target) {
		int count = 0;
		Stack<Integer> stack = new Stack<>();
		//배열을 양수일때 넣고 음수일때 넣고 다 더한다음 타겟이랑 숫자가 같으면 count++
		for(Integer x : numbers) {
			stack.add(x);
		}
		
		return count;
	}
}
