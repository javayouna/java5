package java_test;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		
		
	//String food [] ={"���", "����", "����", "��", "��ġĵ","���"};
	//int cost [] = {2,1,1,1,6,8};
	
		basket b = new basket();
		b.basket_data();
		System.out.println("���� ���� �ݾ���"+b.total+"�� �Դϴ�");
	
	}

}
class basket extends test2_data {
	static int total = 0;
	
	public void basket_data() {
		String user[]= {"���=2", "����=1", "����=1", "��=1", "��ġĵ=6","���=8"};
		System.out.println(Arrays.toString(this.money));
	}
	
	}
