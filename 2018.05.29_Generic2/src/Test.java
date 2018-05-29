
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = new String("Hello");
		box.set(str);
		System.out.println("THe box has "+box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		ibox.set(i);
		//ibox.set(new String("chois")); ibox는 Integer인데 String을 넣으려 해서 에러.
		System.out.println(10+ibox.get());
	}

}
