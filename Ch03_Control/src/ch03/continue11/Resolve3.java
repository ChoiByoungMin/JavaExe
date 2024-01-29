package ch03.continue11;

import java.util.Scanner;

//while문과 Scanner의 nextLine()메서드를 이용해서
//예금,출금,조회,종료 기능 제공
public class Resolve3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isRun =true;
		int money = 0; int m=0;
		while(isRun) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println();
			System.out.print("선택>");
			
			int a = sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("예금액>>");
				m=sc.nextInt();
				money += m;
				break;
			case 2:
				System.out.println("출금액>>");
				m=sc.nextInt();
				money -= m;
				break;
			case 3:
				System.out.println("잔고>>"+ money);
				break;
			case 4:
				isRun=false;
				break;
			}
		}
			
		System.out.println("프로그램 종료");	
/*			if (a==1) {
				System.out.println("예금액>"+10000);
				System.out.println();
			}	
			else if (a==2) {
				System.out.println("출금액>"+2000);
				System.out.println();
			}
			else if (a==3) {
				System.out.println("잔고>"+8000);
				System.out.println();
			}
			
			else if(a == 4) 
				break;
			
		}
*/
	}

}
