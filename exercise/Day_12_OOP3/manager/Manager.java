package manager;

import grade.Gold;
import grade.Silver;

public class Manager {
	private int silverindex = 0;
	private Silver[] silvermembers = new Silver[10];
	
	private int goldindex = 0;
	private Gold[] goldmembers = new Gold[10];
	
	
	public void addMember(Gold g) {
		this.goldmembers[goldindex++] = g;
	}
	public Gold[] getGoldMembers() {
		return goldmembers;
	}
	public int getGoldIndex() {
		return goldindex;
	}
	
	
	public void addMember(Silver s) {
		this.silvermembers[silverindex++] = s;
	}
	public Silver[] getSilverMembers() {
		return silvermembers;
	}
	public int getSilverIndex() {
		return silverindex;
	}
}
