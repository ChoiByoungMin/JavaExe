package ch03.while08;

// 3. while문을 이용해서 1부터 10까지 합을 출력하세요
public class Resolve3 {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while(i<=10) {
			sum += i;
			i++;
			
		}
		System.out.println("1부터 10까지 합은 >> " + sum);
	}

}
