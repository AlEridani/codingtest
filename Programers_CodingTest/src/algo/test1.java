package algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test1 {

	public static void main(String[] args) {
		int[] progresses =  {93, 30, 55};
		int[] speeds = {1, 30, 5};
		solution(progresses,speeds);
	
	}
//	프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다.
//	각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//
//	또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
//	이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다. 
	
//	(큐) 맨앞에 있는게 100이되면 그때 뒤에있는거 100확인하고 뒤에도 100 넘기면 같이함 여기서 나온갯수를 배열로 기록
//	
//
//	먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와
//	각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때
//	각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
	
//	다 더하고 큐에 넣고 확인하고?큐를 초기화?
//	
	  public static int[] solution(int[] progresses, int[] speeds) {
		  		int[] answer = {}; //최종 반환값
		  		int count = 0;// 카운트가 0이 아닐때 조건을 넣어야될것같음
		  		boolean token = true;
		  		ArrayList<Integer> list = new ArrayList<>();//배열크기 몰라서 둔거
		  		Queue<Integer> queue = new LinkedList<>();
		  		int size = speeds.length;
		  		
		  		
		  		for(int i =0;i<size;i++) {//전부 한번씩 더했음//이거 다 한 후에도 계속되면 안됨
		  			if(	progresses[i]<100) {
		  			progresses[i] += speeds[i];
		  			queue.offer(progresses[i]);
		  			}
		  		}
		  		
		  		for(int i =0; i <queue.size();i++) {//100이상일시 사용
		  		if(queue.peek()>=100) {
		  			count++;
		  			}
		  		}
		  		if(count !=0) {//100이상인거 갯수 확인
		  			list.add(count);
		  			count=0;
		  		}
		  		//종료시점 정해야됨
		  		//progresses 얘가 전부 100 넘었을때 list 배열의 값이 langth랑 같을때
		  		
		        
		        return answer;

    }
}

