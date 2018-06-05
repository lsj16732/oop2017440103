import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class AnimalSing {
	List<Animal> list;
	AnimalSing(){
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing();
		}
	}
}
