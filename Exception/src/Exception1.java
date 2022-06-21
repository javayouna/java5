import java.text.*; //

/*
 Exception : try~catch�� �Բ� ���. 
 -RuntimeException:(Error �߻��� ����ó�� üũ �� ��) -Null,Class,Arraysize
 -OtherException (����ó�� üũ���� �����)
 Exception[����]
 Arithmetic : 0���� ���� �� �߻�
 NullPointer : Null��ü ������ ��
 ClassCast : Ŭ������ ��ȯ
 NumberFormat : ���������� ��ȯ 
 ArrayIndexOutOfBound:�迭������ �ε��� ��ȣ ����
 IOException: ����� ���� �߻� (���� ���) 
 Exception : ��ü ����ó�� ��Ȳ (���� ���) ��ǥ�ڵ徲�� �˷��� 
 
 */

public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { // (1)try : �ش� ���� int�� ������ (1)
			a = Integer.valueOf(b);
			// (2)error�߻�:a1�̶�� �����ε�, ������ ���� ��ȯ�� a��� ���ڶ��� ������ �߻�

		} catch (NumberFormatException z) {
			System.out.println(z); // (3) � �κп��� ������ �߻�

		} finally { // catch���� �߻��� ���� ��ü�� �� �ֵ���
			b = b.replaceAll("[a-z][A-Z]", ""); // (4)a���� z���� �� ������ //������ ��ó��
			a = Integer.valueOf("b"); // (5)���� ���ۼ��ؼ� ���
		}
		System.out.println(a); // (6)���� ����� ���

	}

}
