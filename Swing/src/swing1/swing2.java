package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArryaList,LinkedLIst (�迭��) -add,remove,get,size
		//Map (�迭Ű, �迭��) -put, remove
		//Map�� �迭Ű�� ����̶� Ű�� ���� �����͸� Ȯ���մϴ�.(�ӵ� �ֻ��)
		//���� Ű ���� �������� ����� ������ ���ŵ˴ϴ�.
		//��Ű���� ���� �ߺ� ��Ű�� ���� 
		
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap)->0x21949CB (�ߺ����� �߻����� ����)
		m.put("hong","ȫ�浿");
		m.put("kang","������");
		System.out.println(m.get("ȫ�浿"));
		m.put("","�����ż�");//����ִ� Ű�� ��� �� �� ������, Map�������� �ùٸ�������
		m.put("park", ""); //Ű�� ������ ���� ������� ��� ��� ��
		/*
		if(m.get("park").equals("")) { //��������� �� �־�� ex)����ȸ������
			m.put("park", "��");}
			*/
		//	System.out.println(m.get(""));
		m.remove("hong");
		//System.out.println(m);
		//Map:�������� �ڷ����� ����� �� ����
		Map<String, Integer> m2 = new HashMap<>(); //���ڵ� ���� ���ڵ� �� ���� Object ���
		m2.put("age", 32);
		m2.put("level", 5);
		//System.out.println(m2.get("age"));
		System.out.println(m2.keySet()); //Ű�� ���
		System.out.println(m2.values()); //���� ���
		System.out.println(m2.containsKey(""));//�ش�Ű�� �ִ��� Ȯ��(false:����, true:����)
		
		
		}
		
	}


