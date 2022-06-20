package swing1;

import java.util.HashMap;

//swing이 아니긴하지만 삼천포 IO?
public class swing4 {

	public static void main(String[] args) {
		String[][] data= {
				{"d1","123456"},
				{"d1","456789"},
				{"d2","홍길동"},
				{"d2","이순신"},
				{"d3","hong@naver.com"},	
		};
		
		HashMap m = new HashMap<>(); //데이터 자료형과 관계없이
	//	Map<String,String> m = new HashMap<>(); // 문자,문자
	//  Map m2 = new HashMap<>(); //데이터 자료형이 관계없음	
		System.out.println(data[0][0]); //키
		System.out.println(data[0][1]); //data
		
		for(int a=0; a<data.length;a++) {
			if(!m.containsKey(data[a][0])) { // 가 아닐떄 
				m.put(data[a][0],data[a][1]);	
			}
			else {
				m.put(data[a][0]+a,data[a][1]);
			}
		}
		System.out.println(m);
	}

}
