import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		/* 5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		choose one of the following.
		apple
		orange
		banana
		peach

		enter your choice here : (����� �Է�)orange

		--------------
		Your choice is ��orange��.*/
		
		System.out.println("choose one of the following");
		System.out.println("apple");
		System.out.println("orange");
		System.out.println("banana");
		System.out.println("peach");
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your choice here : ");
		str=scan.next();
		
		if(str.equals("apple"))
			System.out.println("apple");
		if(str.equals("orange"))
			System.out.println("orange");
		if(str.equals("banana"))
			System.out.println("banana");
		if(str.equals("peach"))
			System.out.println("peach");
		
		System.out.print("=====���α׷� ����=====");
	}
}

