
public class Exception2 {

	public static void main(String[] args) {
		// Exception2 ex = new Exception2();
		// ex.test();

		try {
			// test(); 메소드호출자체 error Exception과 관계가 없음
			Exception2 ex = new Exception2();
			String a = "홍길동2";
			ex.test(a);

		} catch (Exception z) {
			System.out.println(z);
		}
	}

	public void test(String b) throws Exception,NumberFormatException {
		// throw는 main메소드에서 예외처리 없이 해당 메소드를 호출 할 경우를 막기위해 사용함
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; // 코드 맨 밑에 사용하면 throw=return과 비슷함
		// 예외처리 결과에 대한 값을 main메소드로 다시 return시킴
	}

}
