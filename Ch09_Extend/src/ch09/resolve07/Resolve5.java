package ch09.resolve07;

public class Resolve5 {
	int ballCnt;
	
	public Resolve5(int ballCnt) {
		this.ballCnt = ballCnt;
	}
	public void give(Resolve5 other, int cnt) {
		sub(cnt);
		other.add(cnt);
	}
	public void get(Resolve5 other, int cnt) {
		other.sub(cnt);
		add(cnt);
	}
	public void add(int cnt) {
		this.ballCnt += cnt;
	}
	public void sub(int cnt) {
		this.ballCnt -= cnt;
	}
	public int getBallCnt() {
		return ballCnt;
	}
	public static void main(String[] args) {
		Resolve5 alex = new Resolve5(15);
		Resolve5 james = new Resolve5(9);
		
		alex.get(james, 2);
		james.get(alex, 7);
		
		System.out.println("alex의 구슬 수=" + alex.getBallCnt());
		System.out.println("james의 구슬 수=" + james.getBallCnt());
	}
	

}
