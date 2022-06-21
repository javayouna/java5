import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 * [응용문제] data = {"hong45","lee90","kang100","park70","kim72"}; 해당 배열 데이터 값을
		 * main2메소드로 값을 던집니다. 해당 값을 던질 때 예외처리를 무조건 발생 시켜야되고 최초 값을 던질 때 가공없이 던지게 됩니다.
		 * main2에서는 해당 배열 값을 받은 후 해당 점수 모두 합산 한 결과가 놔야아합니다. 단, 숫자 변환시 문제가 발생할 경우
		 * finally로 체크 후 해당 main2메소드로 다시 콜을 호출하여 정상적으로 데이터가 나오도록 하세요.
		 * 
		 */

		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		try {
			total_method(data);

		} catch (Exception z) {
			//System.out.println(z);
		} finally {
			ArrayList<String> rdata = new ArrayList<String>();
			// String data2[] = null;
			int j = 0;
			while (j < data.length) {
				String modify = data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			
			int q =0;
			do {
				cdata[q]=rdata.get(q);
				q++;
			}while(q<rdata.size());

			//System.out.println(Arrays.toString(cdata));

			try {
				total_method(cdata);
			} catch (Exception h) {
				//pringStackTrace() 사용금지
				if(h.getMessage()==null) { //For input string: "hong45"이런거 출력 되는 거 
					System.exit(0);
				}
				//System.out.println(h.getMessage()); //? 
				}
				}
		}

	

	static public void total_method(String db[]) throws Exception { // new하기싫어서 static

		int w = 0;
		int ea = db.length;
		int values;
		int jumsu = 0;
		while (w < ea) {
			values = Integer.valueOf(db[w]);
			jumsu += values;
			w++;
		}

		System.out.println(jumsu);
		Exception e = new Exception();
		throw e;

	}

}
