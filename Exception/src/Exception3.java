import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 * [���빮��] data = {"hong45","lee90","kang100","park70","kim72"}; �ش� �迭 ������ ����
		 * main2�޼ҵ�� ���� �����ϴ�. �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿߵǰ� ���� ���� ���� �� �������� ������ �˴ϴ�.
		 * main2������ �ش� �迭 ���� ���� �� �ش� ���� ��� �ջ� �� ����� ���߾��մϴ�. ��, ���� ��ȯ�� ������ �߻��� ���
		 * finally�� üũ �� �ش� main2�޼ҵ�� �ٽ� ���� ȣ���Ͽ� ���������� �����Ͱ� �������� �ϼ���.
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
				//pringStackTrace() ������
				if(h.getMessage()==null) { //For input string: "hong45"�̷��� ��� �Ǵ� �� 
					System.exit(0);
				}
				//System.out.println(h.getMessage()); //? 
				}
				}
		}

	

	static public void total_method(String db[]) throws Exception { // new�ϱ�Ⱦ static

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
