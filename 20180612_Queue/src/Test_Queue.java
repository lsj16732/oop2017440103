import java.util.*;

public class Test_Queue {

	public static void main(String[] args) throws InterruptedException {
		//Queue<String> str = new LinkedList<String>();	//Queue�� ���ڸ� �־��ش�.
		Queue<String> str = new PriorityQueue<String>();	//���ĺ� �� �켱����
		str.add("��");//ť �� ���� ��Ҹ� �߰��Ѵ�.
		str.add("��");
		str.add("��");
		str.add("��");
		
		while(!str.isEmpty()) {
			System.out.println(str.remove());	//���� ������� ������. First in First Out
			//ť �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ
			Thread.sleep(1000); //1000ms���� ����..
		}
	}

}
