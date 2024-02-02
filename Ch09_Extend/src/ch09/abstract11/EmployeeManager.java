package ch09.abstract11;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100; // 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0; // 저장된 사원 객체 수, 다음 사원이 저장될 index
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
		System.out.println("8. 종료");
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
		
		if(this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp++;
			isSave = true;
		}else {
			
			return isSave;
		}
	
		return true;
	}
	private void viewRegularEmployeeInfo() {
		for(int i =0;i <this.numOfEmp;i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof RegularEmployee)
				this.empArr[i].showEmployeeInfo();
		}
	}
	private void viewTempEmployeeInfo() {
		for(int i =0;i <this.numOfEmp;i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof TempEmployee)
			this.empArr[i].showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(int i =0;i <this.numOfEmp;i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof PartTimeEmployee)
				
			this.empArr[i].showEmployeeInfo();
		}
	}
	private void viewAllEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			this.empArr[i].showEmployeeInfo();
		}
		
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
