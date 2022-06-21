
public class Exception6 {

	public static void main(String[] args) {
		/*
		 응용문제. 사용자가 45*3+16+5+22*8 해당 연산 값의 최종값을
		 외부 클래스로 전송합니다.
		 
		 해당 외부 클래스에서는 해당 값이 짝수일 경우 예외오류를 발생하며
		 홀수일 경우 홀수값 입니다. 로 다시 회신 되도록 합니다.
		 * */
		//return메소드가 string 이어야함
		
		/* 응용문제 숙제
		  data file {"홍길동", 55 , "유관순", "강감찬", 48,"이순신","세종",34,88}
		  해당 데이터 값중 문자값만 출력 되도록 재 배열 하시길 바랍니다.
		  단, main에서는 해당 배열을 외부 클래스 (setter)로 전송합니다.
		  해당 setter에서 배열값을 확인하여 이름만 재배열로 생성
		  getter에서 해당 배열 return으로 보내도록 합니다.
		  단, 외부 클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */
		cost cs = new cost();
		int sum = 45*3+16+5+22*8;
		try {
			String result = cs.a(null);
			System.out.println(result);
			
		}
		catch(Exception e) {
			
			if(sum%2==0) {
				System.out.println(e);
			}
			else {
				
			}
		}
		
		
		
		
	}

}
class cost{
	public String a(String aa) throws Exception{
		if
	}

}