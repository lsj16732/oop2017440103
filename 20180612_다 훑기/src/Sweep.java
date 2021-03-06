import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;
		//strs = new HashSet<String>(); //해쉬함수 순서로.. 즉 순서를 알 수 없음
		//strs = new TreeSet<String>();	//알파벳순으로 정렬되어 저장
		strs = new LinkedHashSet<String>();	//입력순으로
		//기본적 메소드 add(), remove(), sweep(),,,
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//첫번째 훑는 방법: iterator 사용
		Iterator<String> e = strs.iterator();
		while(e.hasNext()) {//끝까지 훑다
			String str = e.next();//하나씩 빼낸다
			System.out.println(str);
		}
	
		//두번째 훑는 방법: for() 반복문 사용
		for (String str1: strs) {//for (요소타입 참조변수: 콜렉션 변수)
			System.out.println(str1);
		}
	}

}
