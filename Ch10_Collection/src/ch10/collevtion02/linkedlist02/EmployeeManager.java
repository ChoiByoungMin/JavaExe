package ch10.collevtion02.linkedlist02;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private List<Employee> empLink = new LinkedList<>();
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사번으로 검색");
		System.out.println("9. 사번 수정");
		System.out.println("10.사번 삭제");
		System.out.println("11. 종료");
		System.out.println("번호 입력 >>");
		int sel = sc.nextInt();
		return sel;
	}
	private RegularEmployee creatRegularEmployee() {
		System.out.print("사번 >>");
		String empno = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("연봉 >>");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >>");
		int bonus = sc.nextInt();
		RegularEmployee emp =
				new RegularEmployee(empno, name, yearSalary,bonus);
		return emp;
	}
	private TempEmployee creatTempEmployee() {
		System.out.print("사번 >>");
		String empno = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("연봉 >>");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >>");
		int hireYear = sc.nextInt();
		TempEmployee emp =
				new TempEmployee(empno, name, yearSalary,hireYear);
		return emp;
	}
	private PartTimeEmployee creatPartTimeEmployee() {
		System.out.print("사번 >>");
		String empno = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("일당 >>");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >>");
		int workDay = sc.nextInt();
		PartTimeEmployee emp =
				new PartTimeEmployee(empno, name, dailyPay,workDay);
		return emp;
		
	}
	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;
		
		if(this.empLink.size() < EMP_NUM) {
			this.empLink.add(emp);;
			isSave = true;
		}else {
			
			return isSave;
		}
	
		return true;
	}
	
	private void viewRegularEmployeeInfo() {
		for(int i =0;i <this.empLink.size();i++) {
			Employee emp = this.empLink.get(i);
			if(emp instanceof RegularEmployee)
				this.empLink.get(i).showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		for(int i =0;i <this.empLink.size();i++) {
			Employee emp = this.empLink.get(i);
			if(emp instanceof TempEmployee)
			this.empLink.get(i).showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(int i =0;i <this.empLink.size();i++) {
			Employee emp = this.empLink.get(i);
			if(emp instanceof PartTimeEmployee)
			this.empLink.get(i).showEmployeeInfo();
		}
	}
	private void viewAllEmployeeInfo() {
		for(int i=0;i<this.empLink.size();i++) {
			this.empLink.get(i).showEmployeeInfo();
		}
		
	}
	
	private void search() {						
		System.out.print("사번을 입력해주세요 >>");
		String empno = sc.next();
		// 사번정보를 가져와서 그정보와 일치하는지 확인
		for(Employee emp : empLink) {
			if(emp.getEmpno().equals(empno)) {
			emp.showEmployeeInfo();
			return;
			}
		}
		System.out.println("해당하는 사원을 찾지 못했습니다.");
	}
	
	private void modify() {
		System.out.print("사번을 입력해주세요 >>");
		String empno = sc.next();
		
		// 정규직 계약직 선택할변수 선택
		//변수 받은걸로 switch case 문 사용
		// 수정할때 어떤 함수를 쓰는지 찾고 그 함수가 어떤 파라미터를 사용는지
		// set Index 셋팅값 - 덮어쓰기 사용
		
		for(Employee emp : empLink) {
			if(emp.getEmpno().equals(empno)) {
				
			}
		}
	}
	
	private void remove() {
		System.out.print("사번을 입력해 주세요 >> ");
		String empno = sc.next();
		
		for(Employee emp : empLink) {
			if(emp.getEmpno().equals(empno)) {
				empLink.remove(emp);
				System.out.println("사원 정보를 삭제 했습니다.");
				return;
			}
		}
		System.out.println("정보를 찾을수 없습니다.");
	}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = creatRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = creatTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = creatPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				viewRegularEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartTimeEmployeeInfo();
				break;
			case EmpMenu.SEARCH:
				search();
				break;
			case EmpMenu.MODIFY:
				 modify();
				break;
			case EmpMenu.REMOVE:
				remove();
				break;	
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			//emp 객채가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
		
	}

}
