
public class Exception6 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� �������� �ܺ� Ŭ������ �����մϴ�.
		 * 
		 * �ش� �ܺ� Ŭ���������� �ش� ���� ¦���� ��� ���ܿ����� �߻��ϸ� Ȧ���� ��� Ȧ���� �Դϴ�. 
		 * �� �ٽ� ȸ�� �ǵ��� �մϴ�.
		 * (return)
		 */

		// return�޼ҵ尡 string �̾����

		cul cs = new cul();
		// int sum = 45 * 3 + 16 + 5 + 22 * 8;

		try {
			int sum = 45 * 3 + 16 + 5 + 22 * 8;
			cul cl = new cul();
			String result = cl.cul_method(sum); // return��..! �׷��� �տ� String!!
			System.out.println(result);

		} catch (Exception e) {
			if (e.getMessage() != null);
			System.out.println(e.getMessage());

		}
	}

}

class cul {
	// �ڷ��� �޼ҵ忡�� return�� ����, ����, �Ҽ�, Object�� ���� �ڷ��� ����Ǿ� ����
	public String cul_method(int s) throws Exception {
		if (s % 2 == 0) {
			Exception ec = new Exception("����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�");
			throw ec;
			// throw new Exception("����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�.") �̰͵� �¾ƿ�
		} else {
			String msg = "Ȧ���Դϴ�.";
			return msg;
		}
		// return null;
	}

}