package java_test;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		
		
	//String food [] ={"사과", "양파", "마늘", "파", "참치캔","라면"};
	//int cost [] = {2,1,1,1,6,8};
	
		basket b = new basket();
		b.basket_data();
		System.out.println("최종 결제 금액은"+b.total+"원 입니다");
	
	}

}
class basket extends test2_data {
	static int total = 0;
	
	public void basket_data() {
		String user[]= {"사과=2", "양파=1", "마늘=1", "파=1", "참치캔=6","라면=8"};
		System.out.println(Arrays.toString(this.money));
	}
	
	}
