package ch09.resolve07;

/* 클래스 설계에서 접근권한 설정
 * 1) 필드 -> private
 *    메서드 -> public
 * 2) 메서드 중에 내부에서만 사용하는 메서드 -> private  
 * 
 */
public class Resolve5 {
	private int ballCnt;
	
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
	private void add(int cnt) {
		this.ballCnt += cnt;
	}
	private void sub(int cnt) {
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
