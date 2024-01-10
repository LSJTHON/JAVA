package ch12.sec03.exam01;

public class Member {
	public String id;
	
	
		//생성자
	public Member(String id) {
		this.id = id;
	}

//메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {
				return true;	
			}
		}
		return false;
	}
	
	
}
