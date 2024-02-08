package ch14.exception01.ch11.sec04;
// 예외가 발생했든 정상적으로 실행 되었든 close 자동으로 호출된다.
public class TryWithResorceExample {
	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리:" + e.getMessage());
		}
		
		System.out.println();
		
		try(MyResource res = new MyResource("A")){
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리:" + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read2();
		}catch(Exception e) {
			System.out.println("예외 처리:"+ e.getMessage());
		}
	}

}
