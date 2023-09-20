package algo;

public class test13 {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.println(solution(people, limit));
	}
	
	
	    public static int solution(int[] people, int limit) {
	        int answer = 0;
	        int size = people.length;
	        int weitght = 0;
	        for(int i =0; i < size;i++) {
	        	if(!(i + 1 > size)) {
	        		if(weitght > people[i] + people[i+1])
	        		weitght = people[i] + people[i+1];
	        	}
	        }
	        return answer;
	    }
	

}
