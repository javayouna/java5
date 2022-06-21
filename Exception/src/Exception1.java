import java.text.*; //

/*
 Exception : try~catch와 함께 사용. 
 -RuntimeException:(Error 발생시 예외처리 체크 안 함) -Null,Class,Arraysize
 -OtherException (예외처리 체크사항 모두함)
 Exception[종류]
 Arithmetic : 0으로 나눌 때 발생
 NullPointer : Null객체 참조할 때
 ClassCast : 클래스형 변환
 NumberFormat : 숫자형으로 변환 
 ArrayIndexOutOfBound:배열참조시 인덱스 번호 오류
 IOException: 입출력 문제 발생 (많이 사용) 
 Exception : 전체 예외처리 현황 (많이 사용) 대표코드쓰면 알려줌 
 
 */

public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { // (1)try : 해당 값을 int로 변경함 (1)
			a = Integer.valueOf(b);
			// (2)error발생:a1이라는 문자인데, 강제로 숫자 변환시 a라는 문자때메 오류가 발생

		} catch (NumberFormatException z) {
			System.out.println(z); // (3) 어떤 부분에서 문제가 발생

		} finally { // catch에서 발생한 버그 대체할 수 있도록
			b = b.replaceAll("[a-z][A-Z]", ""); // (4)a에서 z까지 다 지워라 //데이터 재처리
			a = Integer.valueOf("b"); // (5)문법 재작성해서 사용
		}
		System.out.println(a); // (6)최종 결과값 출력

	}

}
