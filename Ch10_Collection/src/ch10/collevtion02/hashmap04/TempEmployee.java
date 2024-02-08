package ch10.collevtion02.hashmap04;

// 임시직 사원
public class TempEmployee extends Employee{
	
	protected int yearSalary; // 연봉
	protected int hireYear; // 계약기간

	public TempEmployee(String empno, String name,
			int yearSalary, int hireYear) {
		super(empno, name);
		this.yearSalary = yearSalary;
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)yearSalary/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("yearSalary : "+ yearSalary);
		System.out.println("hireYear : "+ hireYear);
		System.out.printf("moneyPay : %.2f\n", getMonthPay());
	}

	@Override
	public String getEmpno() {
		// TODO Auto-generated method stub
		return empno;
	}
	
	

}