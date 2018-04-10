
public class Point {
	//���� ��ǥ�� ��Ÿ���� �ʵ� ����
	//Fields
	private double x;
	private double y;
	
	//private �ʵ忡 ���� �ְ� ���� �ҷ����� ���ؼ� ���� getter, setter�� ����� ��
	//source -> generate getters and setters
	//Getters&Setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;	//�º���x�� �� Ŭ������ �ʵ� x�̰� �캯�� x�� �� �޼ҵ��� �Ű����� x�̴�. ���� setX�޼ҵ尡 ������ ���� �Ű����� x�� ������ �������.
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
	//�������� �������� �Ÿ��� ����Ѵ�.
	
	public double distance(Point p) {	//�Ű����� PointŬ���� ��üp�� �־���.
		return Math.sqrt( (this.x-p.getX())*(this.x-p.getX()) + (this.y-p.getY())*(this.y-p.getY()) );
	}
	//p������ �������� �Ÿ��� ����Ѵ�.
	
	public void print() {
		System.out.println("("+x+","+y+")");	//�� Ŭ���� �ʵ� x, y
		//System.out.println("("+getX()+","+getY()+")");	//�� Ŭ���� �޼ҵ� getX, getY�� ����
		//System.out.println("("+this.x+","+this.y+")");	//�ش� ��ü�� �ʵ� x, y
		//System.out.println("("+this.getX()+","+this.getY()+")");	//�ش� ��ü�� �޼ҵ� getX, getY�� ����
		//�� �� ����� �� ��!
		//x�� getX()�� ���ϰ��� String�� �ƴ϶� double.. ���� String�� �ƴϸ� ��ü�� ���� ToString�̶�� �޼ҵ带 ȣ���ϱ� ������ �˾Ƽ� �ٲ�� ���̴�.
		
		//this�� �ش� ��ü�� ����Ŵ. ���� �̸��� ���� ��� ȥ���� ���� ���ؼ� ���.
	}
	//���� ���� ��ǥ�� ����Ѵ�.
	
	public String toString() {//String�� ��ȯ�ϴ� �޼ҵ� toString ����
		//toString�� ��ȯ���� �ݵ�� String�̾�� ��. ���!
		return ("("+this.x+","+this.y+")");
		//toString(this.x)��� ���� ������ ���� ����: �޼ҵ���()�ȿ��� reference�� ���� �ϴµ� �� this.x�� primitive double�̹Ƿ� ������ ��.
		//this.x, this.y�� ����� double���� �˾Ƽ� String���� �ٲ��ش�.
	}
	
}
