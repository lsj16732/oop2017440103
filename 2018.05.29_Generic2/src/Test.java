
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = new String("Hello");
		box.set(str);
		System.out.println("THe box has "+box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		ibox.set(i);
		//ibox.set(new String("chois")); ibox�� Integer�ε� String�� ������ �ؼ� ����.
		System.out.println(10+ibox.get());
	}

}
