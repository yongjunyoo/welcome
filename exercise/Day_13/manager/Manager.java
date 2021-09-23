package manager;

import grade.Silver;
import grade.Gold;
import grade.Grade;

public class Manager {
//	private Silver[] silverMembers = new Silver[10];
//	private int silverIndex = 0;
//
//	private Gold[] goldMembers = new Gold[10];
//	private int goldIndex = 0;
	
	
	// 다형성을 통해 상위 클래스인 Grade배열과 인덱스를 하나만 만들어도 됨.
	private Grade[] members = new Grade[10];
	// new가 가능한 이유 : grade를 new하고 인스턴스를 생성하는 것과 grade형 배열을 new하는 거랑은 다른것.
	private int index = 0;


//	public void addMember(Silver s) {
//		this.silverMembers[silverIndex++] = s;
//	}
//	public void addMember(Gold g) {
//		this.goldMembers[goldIndex++] = g;
//	}
	public void addMember(Grade g) {
		try {
			this.members[index++] = g;
		}catch(Exception e) {
			Grade[] tmp = new Grade[members.length*2];
			for(int i=0; i<members.length; i++) {
				tmp[i] = members[i];
			}
			this.members = tmp;
			// 해결책으로 Vector(Dynamic Array). -> 현재는 ArrayList(Dynamic Array).
			// 배열의 수를 늘리기만 하는 것일 뿐, 삭제된다면? 메모리의 null이 생김.
			// ArrayList는 데이터의 갯수가 많아지자 Overhaed가 발생함.(null에 땡겨 쓰니 배보다 배꼽이 더 크다.)
			// 변수를 만들어 놓고 주소값을 통해 연결하는 LinkedList.로 ArrayList의 단점 극복.
			
			// ArrayList --> 동적배열(스마트배열)
			// 장점 : 스스로 사이즈를 조절하고 빈공간을 채워주는 기능을 수행
			// 단점 : 비순차적(중간에서 갑자기) 데이터를 삭제할 경우 비정상적인 성능저하
			// LinkedList --> 주소 참조 연결
			// 장점 : 비순차적 데이터 삭제에 효율적으로 반응, 성능저하 없음.
			// 단점 : 순차적 데이터 입력에 대해 동적배열보다 상대적으로 느림.
			// ---> 공통적 단점 : 대량의 데이터가 보관되어 있을 시 검색 성능이 낮음.
			
			// Hash / Tree알고리즘
			// 장점 : 검색성능이 비약적으로 향상.
			// 단점 : 데이터 입력성능은 포기하다시피 구성.
			
			// 트리알고리즘 : 노드에 데이터를 저장하여 작으면 왼쪽 크면 오른쪽으로 집어넣어 가지를 늘리는 방법. 
			// 입력시엔 if문의 반복으로 크기를 구분해야하는 번거로움이 있으나. 검색시 반으로 쪼개나가 검색용이.
			
			// ---> 위의 모든 알고리즘들은 Collection.
		}
	}

//	public Silver[] getSilverMembers() {
//		return silverMembers;
//	}
//	public Gold[] getGoldMembers() {
//		return goldMembers;
//	}
//	public int getSilverIndex() {
//		return silverIndex;
//	}
//	public int getGoldIndex() {
//		return goldIndex;
//	}
	public Grade[] getMembers() {
		return members;
	}
	public int getIndex() {
		return index;
	}
}