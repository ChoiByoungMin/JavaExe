package ch10.collevtion02.hashmap02;

// 일용직 사원
public class PartTimeEmployee extends Employee{
	
	protected int dailyPay; //일당
	protected int workDay; //일한 일수

	public PartTimeEmployee(String empno, String name,
			int dailyPay, int workDay) {
		super(empno, name);
		this.dailyPay = dailyPay;
		this.workDay = workDay;
		
	}

	@Override
	public double getMonthPay() {
		double mPay = dailyPay*workDay;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		
		super.showEmployeeInfo();
		System.out.println("dailyPay :"+ dailyPay);
		System.out.println("workDay :"+ workDay);
		System.out.printf("moneyPay : %.2f\n", getMonthPay());
	}

	@Override
	public String getEmpno() {
		// TODO Auto-generated method stub
		return empno;
	}
	
	

}
