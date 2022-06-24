package imsi;

import java.util.ArrayList;
import java.util.Arrays;

public class imsi2 {

	public static void main(String[] args) {
		/*응용문제[숙제]
		 *ArratsList 또는 LinkedList 둘 중 원하는 걸로~
		 *구현하시면 됩니다.
		 *2차 배열 형태입니다.
		 *해당 데이터값을 모두 더하여 짝수인지 홀수인지 확인하세요.
		 *Integer data[][] ={
		 *	{10,20,30,40,50,60,70},
		 *	{3,6,9,12,15,17,19}
		 *}
		 *결과는 총합 00000 이고 짝수입니다.
		 *결과는 총합 361이고 홀수입니다.
		 */
		
		
		Integer data[][] ={
				 	{10,20,30,40,50,60,70},
				 	{3,6,9,12,15,17,19}
				 };
		 
		//ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(data));
		
		
		ArrayList<Integer>[] list = new ArrayList[data.length];
		//list.add(data);
		
		int sum=0;
		for(int i=0;i<data.length;i++) {
			sum+=list
		}
		
		
		
		
		
		
	}

}
