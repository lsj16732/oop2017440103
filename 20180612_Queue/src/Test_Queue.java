import java.util.*;

public class Test_Queue {

	public static void main(String[] args) throws InterruptedException {
		//Queue<String> str = new LinkedList<String>();	//Queue에 글자를 넣어준다.
		Queue<String> str = new PriorityQueue<String>();	//알파벳 순 우선순위
		str.add("나");//큐 맨 끝에 요소를 추가한다.
		str.add("라");
		str.add("가");
		str.add("다");
		
		while(!str.isEmpty()) {
			System.out.println(str.remove());	//넣은 순서대로 빠진다. First in First Out
			//큐 맨 앞에서 요소를 제거하여 그 요소를 반환
			Thread.sleep(1000); //1000ms동안 쿨쿨..
		}
	}

}
