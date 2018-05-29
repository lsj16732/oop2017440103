
public class Box <T> {	//T에는 어떤 type이라도 들어올 수 있음.
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
}
