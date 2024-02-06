package ch10.collevtion01.ch15.sec03.exam02;

import java.lang.annotation.Target;

/*
 * Member 객체의 내용(이름 , 나이)로 객체가 같은지 다른지 비교하기 위해서는
 * Object로부터 상속받은 hashCode()와 equals() 룰 overriding해야 한다.
 * overriding하지 않으면 각각 객체의 해시값과 객체의 주소를 가지고 비교하지만
 * 아래처럼 overridding하면 객체내의 필드 내용으로 비교한다.
 */
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode()+ age;
	}
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		}else {
			return false;
		}
		
	}

}
