package ch10.collevtion02.linkedlist02;

//3. linkedlist02 패키지 아래의 클래스들을
//LinkedList로 변환된 클래스를
//사번으로 검색/수정/삭제 기능을 추가하세요

public abstract class Employee {
	
	protected String empno; // 사번
	protected String name; // 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	
	}
	public void showEmployeeInfo() {
		System.out.println("------------------------");
		System.out.println("empno :"+ empno);
		System.out.println("name : "+ name);
	}
	public abstract double getMonthPay(); //추상메서드
	public abstract String getEmpno();
}
