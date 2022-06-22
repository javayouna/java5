
public class Exception6 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 사용자가 45*3+16+5+22*8 해당 연산 값의 최종값을 외부 클래스로 전송합니다.
		 * 
		 * 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며 홀수일 경우 홀수값 입니다. 
		 * 로 다시 회신 되도록 합니다.
		 * (return)
		 */

		// return메소드가 string 이어야함

		cul cs = new cul();
		// int sum = 45 * 3 + 16 + 5 + 22 * 8;

		try {
			int sum = 45 * 3 + 16 + 5 + 22 * 8;
			cul cl = new cul();
			String result = cl.cul_method(sum); // return값..! 그래서 앞에 String!!
			System.out.println(result);

		} catch (Exception e) {
			if (e.getMessage() != null);
			System.out.println(e.getMessage());

		}
	}

}

class cul {
	// 자료형 메소드에서 return값 숫자, 문자, 소수, Object에 따라 자료형 선언되어 생성
	public String cul_method(int s) throws Exception {
		if (s % 2 == 0) {
			Exception ec = new Exception("예외처리 발생으로 재 확인이 필요합니다");
			throw ec;
			// throw new Exception("예외처리 발생으로 재 확인이 필요합니다.") 이것도 맞아요
		} else {
			String msg = "홀수입니다.";
			return msg;
		}
		// return null;
	}

}