import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;
		//strs = new HashSet<String>(); //�ؽ��Լ� ������.. �� ������ �� �� ����
		//strs = new TreeSet<String>();	//���ĺ������� ���ĵǾ� ����
		strs = new LinkedHashSet<String>();	//�Է¼�����
		//�⺻�� �޼ҵ� add(), remove(), sweep(),,,
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//ù��° �ȴ� ���: iterator ���
		Iterator<String> e = strs.iterator();
		while(e.hasNext()) {//������ �ȴ�
			String str = e.next();//�ϳ��� ������
			System.out.println(str);
		}
	
		//�ι�° �ȴ� ���: for() �ݺ��� ���
		for (String str1: strs) {//for (���Ÿ�� ��������: �ݷ��� ����)
			System.out.println(str1);
		}
	}

}
