package algo;

import java.util.ArrayList;
import java.util.Collections;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public long solution(long n) {
    	ArrayList<Long> list = new ArrayList<>();
    	String str="";
         for(;;){
             if(n < 10){
            	 list.add(n);
                 break;
             }
             Long num = n % 10;
            list.add(num);
            n/=10;
         }
	        
         Collections.sort(list, Collections.reverseOrder());
         
         for(Long x : list) {
        	 str += Long.toString(x);
         }
         
         long answer = Long.parseLong(str);
	        return answer; 
 }
}
