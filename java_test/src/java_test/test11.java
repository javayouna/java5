package java_test;

import java.util.Arrays;
import java.util.Collections;

public class test11 {

	public static void main(String[] args) {

		String data [][] =	{
			{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
			{"65","74","23","75","68","96","88","98","54"}
			};
			
		Integer val[]=new Integer[data.length];
		for(int i=0; i<data.length; i++) {
			val[i]=Integer.parseInt(data[1]1]);	
		}		
		Arrays.sort(val,Collections.reverseOrder());
		System.out.println(val);
		
		String result[]=new String[val.length];
		for(int a=0; a<val.length; a++) {
			for(int b=0; b<data.length;b++) {
				
				if(val[a]==Integer.parseInt(data[b][6])) {
					result[a]=data[b][0];
				}
			}
		}
		System.out.println(Arrays.toString(result));

	}
}

	


