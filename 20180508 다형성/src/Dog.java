
public class Dog extends Animal implements Playable {
	@Override
	void sing() {
		System.out.println("A Dog Barks");
	}
	void eat() {
		System.out.println("A dog eats");
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk with dog");
	}
	@Override
	public void fetch() {
		// TODO Auto-generated method stub
		System.out.println("fetch with dog");
	}
	
}
