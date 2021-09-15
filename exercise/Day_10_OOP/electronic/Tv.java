package electronic;
// 오라클에서 정보은닉 규칙을 권고함.
//  - private : 외부에서의 접근을 제한한다. 자신이 속한 클래스 내에서만 접근이 가능.
//  ---> 다른 클래스에서 사용하려고하면 field is not visible.
//  ---> 멤버변수(멤버필드)가 private이기 때문.
//  - default : 패키지 접근제한자라고도 함. 패키지(package) 접근제한자라고도 함. 아무것도 안씀. private보다는 넓고,
//              public보다는 좁음. 같은 패키지 내에서는 접근가능 함.
//  - protected : 
//  - public : 모든 곳에서 접근이 가능하다.
//  ---> private < default < protected < public 순으로 개방적.
public class Tv {

	private int channel;
	private int volume;

	
	// Setters / Getters
	public void setChannel(int cha){ // 외부로 부터 받아와야하기에 매개변수 필요.
		channel = cha; // 매개변수의 값이 channel에 담기고 private int channel;에 담을 수 있음.
	}
	public int getChannel() { // 외부로 나가야하기에 매개변수 필요없음. 리턴해줘야하기에 void못들어감.
		return channel;
	}
	
	public void setVolume(int vol){
		volume = vol;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void powerOn() {

	}
	public void powerOff() {

	}
}
