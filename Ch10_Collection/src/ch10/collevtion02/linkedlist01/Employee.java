package ch10.collevtion02.linkedlist01;

//1. linkedlist01 패키지 아래의 클래스들을
//배열 -> LinkedList로 변환하세요

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
