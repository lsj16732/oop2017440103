
public class HW_2_23 {

	public static void main(String[] args) {
/*
***** *
*** ***
* *****

�� ����Ͻÿ�(�ݺ��� �Ἥ!)
*/

		for(int i=1;i<=5;i=i+2) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
