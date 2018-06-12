import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		//추가하는 것: .put(key, value)
		//특정 키의 value값 찾기: .get(key)
		map.put("재이니","청와대");
		map.put("트럼프","백악관");
		map.put("정으니", "평양");
		
		System.out.println(map.get("재이니"));
		
		//훑는 방법 1: 키셋을 만들어 이 키셋의 iterator 사용
		//Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();	//map.set(): map에 저장된 엔트리(키,값) 중 키만 모은 셋
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(String.format("키: %s, 값: %s", key, map.get(key)));
		}
		
		//훑는 방법 2: 키셋을 만들어 for() 반복문 사용
		for(String key: map.keySet()) {
			System.out.println(String.format("키: %s, 값: %s", key, map.get(key)));
		}
		
		//훑는 방법 3: 엔트리셋을 만드는 방법
		for(Map.Entry<String, String>elem:map.entrySet()) {
			System.out.println(String.format("키: %s, 값: %s", elem.getKey(), elem.getValue()));
		}
	}

}
