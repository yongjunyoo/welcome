package manager;

import grade.Silver;

import java.util.ArrayList;

import grade.Gold;
import grade.Grade;

public class Manager_Copy {
	private ArrayList members = new ArrayList();

	public void addMember(Grade g) {
			this.members.add(g);
		}

	public ArrayList getMembers() {
		return members;
	}
}