
public class Exception2 {

	public static void main(String[] args) {
		// Exception2 ex = new Exception2();
		// ex.test();

		try {
			// test(); �޼ҵ�ȣ����ü error Exception�� ���谡 ����
			Exception2 ex = new Exception2();
			String a = "ȫ�浿2";
			ex.test(a);

		} catch (Exception z) {
			System.out.println(z);
		}
	}

	public void test(String b) throws Exception,NumberFormatException {
		// throw�� main�޼ҵ忡�� ����ó�� ���� �ش� �޼ҵ带 ȣ�� �� ��츦 �������� �����
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; // �ڵ� �� �ؿ� ����ϸ� throw=return�� �����
		// ����ó�� ����� ���� ���� main�޼ҵ�� �ٽ� return��Ŵ
	}

}