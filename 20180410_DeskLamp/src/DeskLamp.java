
public class DeskLamp {
	
	/////Field/////
	private boolean isOn;	//booleanŸ���� ���� �̸��� ��κ� is�� ���� ����� true/false�̱� ����
	
	/////Method/////
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if(this.isOn == true)
			return "�����ֽ��ϴ�.";
		else
			return "�����ֽ��ϴ�.";
	}
	
}
