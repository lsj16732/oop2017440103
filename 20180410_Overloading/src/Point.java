
public class Point {
	//점의 좌표를 나타내는 필드 선언
	//Fields
	private double x;
	private double y;
	
	//private 필드에 값을 넣고 값을 불러오기 위해서 선언 getter, setter를 만들어 줌
	//source -> generate getters and setters
	//Getters&Setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;	//좌변의x는 이 클래스의 필드 x이고 우변의 x는 이 메소드의 매개변수 x이다. 따라서 setX메소드가 끝나고 나면 매개변수 x의 공간은 사라진다.
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	//Methods
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	//원점에서 점까지의 거리를 계산한다.
	
	public double distance(Point p) {	//매개변수 Point클라스의 객체p를 넣어줌.
		return Math.sqrt( (this.x-p.getX())*(this.x-p.getX()) + (this.y-p.getY())*(this.y-p.getY()) );
	}
	//p점에서 점까지의 거리를 계산한다.
	
	public void print() {
		System.out.println("("+x+","+y+")");	//이 클라스의 필드 x, y
		//System.out.println("("+getX()+","+getY()+")");	//이 클라스의 메소드 getX, getY를 실행
		//System.out.println("("+this.x+","+this.y+")");	//해당 객체의 필드 x, y
		//System.out.println("("+this.getX()+","+this.getY()+")");	//해당 객체의 메소드 getX, getY를 실행
		//이 네 방식이 다 돼!
		//x나 getX()의 리턴값은 String이 아니라 double.. 만약 String이 아니면 객체에 대해 ToString이라는 메소드를 호출하기 때문에 알아서 바뀌는 것이다.
		
		//this는 해당 객체를 가르킴. 변수 이름이 같을 경우 혼돈을 막기 위해서 사용.
	}
	//현재 점의 좌표를 출력한다.
	
	public String toString() {//String을 반환하는 메소드 toString 선언
		//toString의 반환형은 반드시 String이어야 함. 약속!
		return ("("+this.x+","+this.y+")");
		//toString(this.x)라고 쓰면 에러가 나는 이유: 메소드의()안에는 reference가 들어가야 하는데 이 this.x는 primitive double이므로 에러인 것.
		//this.x, this.y에 저장된 double값을 알아서 String으로 바꿔준다.
	}
	
}
