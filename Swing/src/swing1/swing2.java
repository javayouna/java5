package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArryaList,LinkedLIst (배열값) -add,remove,get,size
		//Map (배열키, 배열값) -put, remove
		//Map은 배열키가 기반이라서 키를 통해 데이터를 확인합니다.(속도 최상급)
		//같은 키 사용시 마지막에 적용된 값으로 갱신됩니다.
		//※키값을 절대 중복 시키지 않음 
		
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap)->0x21949CB (중복값이 발생하지 않음)
		m.put("hong","홍길동");
		m.put("kang","강감찬");
		System.out.println(m.get("홍길동"));
		m.put("","박혁거세");//비어있는 키를 사용 할 수 있으나, Map원리에는 올바르지않음
		m.put("park", ""); //키는 있으나 값이 비어있을 경우 사용 됨
		/*
		if(m.get("park").equals("")) { //비어있으면 박 넣어라 ex)간편회원가입
			m.put("park", "박");}
			*/
		//	System.out.println(m.get(""));
		m.remove("hong");
		//System.out.println(m);
		//Map:여러개의 자료형을 사용할 수 있음
		Map<String, Integer> m2 = new HashMap<>(); //숫자도 들어가고 문자도 들어갈 때는 Object 사용
		m2.put("age", 32);
		m2.put("level", 5);
		//System.out.println(m2.get("age"));
		System.out.println(m2.keySet()); //키만 출력
		System.out.println(m2.values()); //값만 출력
		System.out.println(m2.containsKey(""));//해당키가 있는지 확인(false:없음, true:있음)
		
		
		}
		
	}


