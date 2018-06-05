
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");	//Upcasting
		Animal aCat = new Cat("망고");	//Upcasting
		aDog.sing();
		aCat.sing();
		//error) aDog.playFetch(); Upcasting했는데, Animal에는 playFetch가 없기 때문
		
		((Dog)aDog).playFetch();//Downcasting
		//error) ((Cat)aDog).playFetch();
		//Runtime Error. ((Dog)aCat).playFetch(); 실제로 돌려봐야 문제인지 아닌지 알수있음. 컴파일때엔 알 수 없어.

	}

}
