package ch05.array04;

//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		String[] names = {"아무개", "존", "시나",
				"순신","강감찬","귀리부인","마이클",
				"브루스","빌리","빌",};
		
		for(int i = 0;i<names.length;i++)
			System.out.print(names[i] + " ");
		
	}

}
