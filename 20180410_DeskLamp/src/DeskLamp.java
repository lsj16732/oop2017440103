
public class DeskLamp {
	
	/////Field/////
	private boolean isOn;	//boolean타입의 변수 이름은 대부분 is로 시작 대답이 true/false이기 때문
	
	/////Method/////
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if(this.isOn == true)
			return "켜져있습니다.";
		else
			return "꺼져있습니다.";
	}
	
}
