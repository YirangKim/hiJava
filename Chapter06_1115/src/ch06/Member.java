package ch06;

public class Member {
	
		//필드
		int membersNo;
		String memberId;
		String memberName;
		
		public Member(int membersNo, String memberId, String memberName) {
			super();
			this.membersNo = membersNo;
			this.memberId = memberId;
			this.memberName = memberName;
		}


	public String toString() {
		return membersNo + "." + memberId + "(" + memberName +")";
	}
}
