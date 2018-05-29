import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		//List<String> list = new ArrayList<String>();
		
		list.add(0, "zero");
		list.add("one");
		list.add("two");
		
		list.add(1,"ตั");
		System.out.println(list);
	}

}
