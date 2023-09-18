package algo;

public class test2 {

	public static void main(String[] args) {
		String str = "1 2 3 4";
		System.out.println(solution(str));
		
	}
	
    public static String solution(String s) {
        String answer = "1";
        String[] strArr = s.split(" ");

        int[] arr = new int[strArr.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < strArr.length;i++) {
        	arr[i] = Integer.parseInt(strArr[i]);
        }
        
        for(int i =0; i<arr.length;i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        	}
        }
        
        for(int i =0; i<arr.length;i++) {
        	if(arr[i] < min) {
        		min = arr[i];
        	}
        }
        
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }

}
