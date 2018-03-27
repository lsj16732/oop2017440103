
public class HW_2_25 {

	public static void main(String[] args) {
/*
다음과 같은 출력이 나오도록 프로그램을 작성하시오.
(1) *********** (2)54321012345
********* 432101234
******* 3210123
***** 21012
*** 101
* 0
*** 101 
***** 21012 
******* 3210123 
********* 432101234 
*********** 54321012345
*/
		
		//(1)
		int row_num=1;
		int row_star_num=11;
		int current_star_num=1;
		int flag=0;
		
		for(row_num=1;row_num<=11;row_num++) {
			for(current_star_num=1;current_star_num<=row_star_num;current_star_num++) {
				System.out.print("*");
			}
			if(row_star_num==1) {
				flag=1;
			}
			if(flag==0) {
				row_star_num=row_star_num-2;
			}
			else {
				row_star_num=row_star_num+2;
			}
			System.out.println();
		}
		System.out.println("=====프로그램 종료=====");
		System.out.println();
	
	//(2)
	int non=11;
	int row=1;
	int max=5;
	int r_flag=0;
	int c_non;
	int num;
	int n_flag;
	
	for(row=1;row<=11;row++) {
		num=max;
		n_flag=0;
		for(c_non=1;c_non<=non;c_non++) {
			System.out.print(num);
			if(num==0) {
				n_flag=1;
			}
			if(n_flag==0) {
				num--;
			}
			else {
				num++;
			}
		}
		System.out.println();
		if(non==1) {
			r_flag=1;
		}
		if(r_flag==0) {
			non=non-2;
			max--;
		}
		else {
			non=non+2;
			max++;
		}	
	}
	System.out.println("=====프로그램 종료=====");
	}
}

