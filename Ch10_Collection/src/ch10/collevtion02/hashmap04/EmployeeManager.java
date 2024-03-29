package ch10.collevtion02.hashmap04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Map<String, Employee> empMap = new HashMap<>();
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
		Employee res = empMap.put(emp.empno, emp);
		if(res == null)
			System.out.println("새로 저장합니다.");
		else
			System.out.println("정보를 수정합니다.");
		return true;
	}
	private void viewRegularEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			if(emp instanceof RegularEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			if(emp instanceof TempEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			if(emp instanceof PartTimeEmployee)
				emp.showEmployeeInfo();
		}
	}
	private void viewAllEmployeeInfo() {
		Set<String> keySet = empMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()){
			String k = keyIterator.next();
			Employee emp = empMap.get(k);
			emp.showEmployeeInfo();
		}
		
	}
	public void search() {
		System.out.print("사번을 입력해 주세요 >> ");
		String empno = sc.next();
		
		Employee emp = empMap.get(empno);
		if(emp!=null) {
			emp.showEmployeeInfo();
		}
		
	}
	
	public void modify() {
		System.out.println("메인 메뉴에서 바꾸고자 하는 사원클래스를 선택후 사원번호를 입력하시면 갱신이 됩니다.");
		sc.nextLine();
	}
	
	public void remove() {
		System.out.print("사번을 입력해 주세요 >> ");
		String empno = sc.next();
		
		Employee emp = empMap.get(empno);
		if(emp != null) {
			empMap.remove(empno);
		}
		System.out.println("정보가 삭제 되었습니다.");
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
