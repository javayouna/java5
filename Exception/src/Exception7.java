import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� data file {"ȫ�浿", 55 , "������", "������", 48,"�̼���","����",34,88} �ش� ������ ����
		 * ���ڰ��� ��� �ǵ��� �� �迭 �Ͻñ� �ٶ��ϴ�. ��, main������ �ش� �迭�� �ܺ� Ŭ���� (setter)�� �����մϴ�. �ش�
		 * setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� ���� getter���� �ش� �迭 return���� �������� �մϴ�. ��, �ܺ� Ŭ��������
		 * ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
//		redata r = new redata();
//		//LinkedList result = r.getter();
//		//ArrayList result=r.geeter2();
//		System.out.println(result);
//		Object data[] = { "ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };

		try {
			redata r = new redata();
			Object data[] = { "ȫ�浿", 55, "������", "������", 48, "�̼���", "����", 34, 88 };
			r.setter(data);
			LinkedList<String> result = r.getter(); //��return �޴� ���� �迭 class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� �մϴ�.
			System.out.println(result);
		} catch (Exception a) {
			if (a.getMessage() != null) {
				System.out.println(a.getMessage());
			}
		}

	}
}

class redata {
	LinkedList<String> redata = new LinkedList<>(); // setter�迭���� ���ڸ� ���� �� ��
	// setter�� getter�� �������� ����ϴ�.. ����ٰ� �������ֱ�
	// public int ea;

	public void setter(Object call[]) throws Exception { // ���⼭ �޾ƾ��� throws Exception
		int ea = call.length; // ����ٰ� ���� setter�ȿ����� ���ϱ�..���� �÷��ֱ�.
		// this.ea=call.length;
		int w = 0;
		// int check = Integer.valueOf((int)call[1]); //object�� �տ� ()�ڷ��� �־��־����
		// int check = (int)call[1]; //object�� �̷��Ե� ���� ���� ��
		// String check = (String)call[0]; //String�� �̷� ����
		// String check = new String((String)call[0]); //�̰͵� ���� ����case
		// System.out.println(check); //
		do { // ���⼭�� try��..!?
			try {
				// ���ش� �迭 �ε�� (�ڷ���) ��ȯ�ϴ� ������ Object�迭 �̹Ƿ� �������� 
				String check = String.valueOf((String) call[w]); // thy catch�� �ݺ����ȿ����� ��� ����
				this.redata.add(check);
				// int check = Integer.valueOf((int) call[w]);
			} catch (Exception e) {
				// ���ڽ� class���� ���� �߻��� ��µǴ� catch�� �� throw����ϸ� �ٽ� main���� ����
				// ���߿��� ������ throw�� ���޽� �ش� �ݺ����� �����ϰ� �˴ϴ�.
				// throw e; ������ main�� �ִ� catch�� !
				// System.out.println(e);
			}
			w++;
		} while (w < ea);
		// System.out.println(redata); ���� ��������

		// System.out.println(this.redata);

	}

	public LinkedList<String> getter() {// ���⼭ ����Ʈ�κ��� ���� �迭�� ���� ���� �Ǵ�
		// �� public ������ �迭class�̸����� ���� �� ����
		return this.redata;

//	LinkedList<String> lk = new LinkedList<>();	
////	lk.add("ȫ�浿");
////	lk.add("�̼���");
////	lk.add("������");
////	
//	return lk;
	}
}

/*
 * public ArrayList<String> getter2() {//ArrayList�� case
 * 
 * ArrayList<String> lk = new ArrayList<>(); lk.add("ȫ�浿"); lk.add("�̼���");
 * lk.add("������");
 * 
 * return lk; }
 * 
 */
