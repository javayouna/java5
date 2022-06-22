import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		 * 응용문제 숙제 data file {"홍길동", 55 , "유관순", "강감찬", 48,"이순신","세종",34,88} 해당 데이터 값중
		 * 문자값만 출력 되도록 재 배열 하시길 바랍니다. 단, main에서는 해당 배열을 외부 클래스 (setter)로 전송합니다. 해당
		 * setter에서 배열값을 확인하여 이름만 재배열로 생성 getter에서 해당 배열 return으로 보내도록 합니다. 단, 외부 클래스에서
		 * 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */
//		redata r = new redata();
//		//LinkedList result = r.getter();
//		//ArrayList result=r.geeter2();
//		System.out.println(result);
//		Object data[] = { "홍길동", 55, "유관순", "강감찬", 48, "이순신", "세종", 34, 88 };

		try {
			redata r = new redata();
			Object data[] = { "홍길동", 55, "유관순", "강감찬", 48, "이순신", "세종", 34, 88 };
			r.setter(data);
			LinkedList<String> result = r.getter(); //★return 받는 값이 배열 class이므로 해당 class명으로 선언 후 받아야 합니다.
			System.out.println(result);
		} catch (Exception a) {
			if (a.getMessage() != null) {
				System.out.println(a.getMessage());
			}
		}

	}
}

class redata {
	LinkedList<String> redata = new LinkedList<>(); // setter배열에서 문자만 추출 할 거
	// setter랑 getter랑 공용으로 써야하니.. 여기다가 선언해주기
	// public int ea;

	public void setter(Object call[]) throws Exception { // 여기서 받아야함 throws Exception
		int ea = call.length; // 여기다가 쓰면 setter안에서만 들어가니까..위로 올려주기.
		// this.ea=call.length;
		int w = 0;
		// int check = Integer.valueOf((int)call[1]); //object는 앞에 ()자료형 넣어주어야함
		// int check = (int)call[1]; //object는 이렇게도 가용 가능 함
		// String check = (String)call[0]; //String은 이런 형식
		// String check = new String((String)call[0]); //이것도 가능 선언case
		// System.out.println(check); //
		do { // 여기서도 try를..!?
			try {
				// ★해당 배열 로드시 (자료형) 변환하는 이유는 Object배열 이므로 선언했음 
				String check = String.valueOf((String) call[w]); // thy catch는 반복문안에서도 사용 가능
				this.redata.add(check);
				// int check = Integer.valueOf((int) call[w]);
			} catch (Exception e) {
				// ★자신 class에서 문제 발생시 출력되는 catch문 단 throw사용하면 다시 main으로 전달
				// ★중요한 사항은 throw로 전달시 해당 반복문은 종료하게 됩니다.
				// throw e; 했으면 main에 있는 catch로 !
				// System.out.println(e);
			}
			w++;
		} while (w < ea);
		// System.out.println(redata); 위로 던져주자

		// System.out.println(this.redata);

	}

	public LinkedList<String> getter() {// 여기서 리스트로보낼 건지 배열로 보낼 건지 판단
		// ★ public 다음에 배열class이름으로 만들 수 있음
		return this.redata;

//	LinkedList<String> lk = new LinkedList<>();	
////	lk.add("홍길동");
////	lk.add("이순신");
////	lk.add("유관순");
////	
//	return lk;
	}
}

/*
 * public ArrayList<String> getter2() {//ArrayList인 case
 * 
 * ArrayList<String> lk = new ArrayList<>(); lk.add("홍길동"); lk.add("이순신");
 * lk.add("유관순");
 * 
 * return lk; }
 * 
 */
