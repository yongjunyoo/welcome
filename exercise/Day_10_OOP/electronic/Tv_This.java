package electronic;

public class Tv_This {
	public class Tv {
		private int channel;
		private int volume;
		public int getChannel() {
			return channel;
		}
		public void setChannel(int channel) {
			this.channel = channel;
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
//  - 좌측 상단의 source – generate getters and setters으로 생성가능.(alt+shift+s+r alt+a+r)
//	- 멤버필드와 매개변수가 같은 이름으로 생성되버림.
//	- this.channel = channel;에서 this.channel은 멤버필드 channel을 지정하고 있음.
//	- 멤버필드는 힙에 만듦. 메소드 내에 만들어진 지역변수는 스택에 만듦. 매개변수 또한 스택에 만듦 !
//	- this는 자기참조변수(주소값을 스스로 가짐). 따라서 멤버필드로 channel, volume, this가 생성되고 
//  - this는 자기스스로 1000번지의 주소를 가짐.
//	- lg.channel과 lg.volume은 가능하나 lg.this는 불가능함. why? this는 자기참조변수이기에 불러올 수 없다.
	}
}
