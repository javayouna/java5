package swing1;

public class swing1 {

	public static void main(String[] args) {
		//wrapper class (box����)
		//float,char,byte,long,short (�⺻Ÿ��)
		//wrapper class:Byte, Interger, Long, Double (�ձ��� �빮��)

		Integer a = new Integer(20); // new Integer(�ڽ�)
		int b = new Integer(20); //int b�� ��ڽ� 
		if(a.equals(b)) {
			System.out.println(a+b);
		}
		Integer no1 = 10; //��ڽ�
		Integer no =new Integer(99); //�ڽ�
		//int aa = no; //��ڽ�(�ڵ�)
		Integer bb=no.intValue();//��ڽ�
		System.out.println(bb);
	
		
		/*�ڽ̰� �ڽ��� ���� ���� equals�� ����ؾ߸� �񱳰� �̷����*/
		
		
	}

}
