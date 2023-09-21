package algo;

public class test13 {

	public static void main(String[] args) {
		int[] people = {4, 3, 2, 1};
		
		for(Integer x : solution(people))
		System.out.println(x);
	}
	
	 public static int[] solution(int[] arr) {
	   int[] answer = new int[arr.length-1];
       if(arr.length == 1){
           int[] x = {-1};
           return x;
       }
       int min = Integer.MAX_VALUE;
       for(Integer x : arr) {
    	   if(x < min) {
    		min = x;   
    	   }   
       }
       for(int i =0; i < arr.length;i++) {
    	   if(arr[i] == min) {
    		   arr[i] = 0;
    	   }
       }
       int count = 0;
       for(int i = 0; i < arr.length; i ++) {
    	   if(arr[i] != 0) {
    		   answer[count] = arr[i];
    		   count++;
    	   }
       }
       
     
       return answer;
	
	 }
}
