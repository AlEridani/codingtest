package algo;

public class test8 {

	public static void main(String[] args) {
		int[] arr1 = { 44, 1, 0, 0, 31, 25 };
		int[] arr2 = { 31, 10, 45, 1, 6, 19 };
		int[] result = solution(arr1, arr2);
		for (Integer x : result) {
			System.out.println(x);
		}
	}

	public static int[] solution(int[] lottos, int[] win_nums) {

		int size = lottos.length;
		int winCount = 0;
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (lottos[i] == 0) {
				winCount++;
			} else {
				for (int j = 0; j < size - i; j++) {
					if (lottos[i] == win_nums[j]) {
						winCount++;
						count++;
					}
				}
			}
		}
		int[] answer = { rank(winCount), rank(count) };
		return answer;
	}

	public static int rank(int count) {
		int result;
		switch (count) {
		case 6:
			result = 1;
			break;
		case 5:
			result = 2;
			break;
		case 4:
			result = 3;
			break;
		case 3:
			result = 4;
			break;
		case 2:
			result = 5;
			break;
		default:
			result = 6;
			break;
		}

		return result;

	}

}
