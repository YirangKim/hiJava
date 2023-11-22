package ch09;

// p.357 클래스

public class User {
	
	// 필드
	int userIdx;
	String userId;
	
	// 기본생성자 = 매개변수 생성자를 만들었다
	public User() { 	}
	
	// 생성자
	public User(int userIdx, String userId) {
		this.userIdx = userIdx;
		this.userId = userId;
	}

	// 메소드
	// getUserIdx()
	// int는 반환값 있다
	public int getUserIdx() {
		return userIdx;
	}
	
	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}
	
		
	public String getUserId() {
		return userId;
	}
		
	public void setUserId(String userId) {
		this.userId = userId;
	}
		
	
}
