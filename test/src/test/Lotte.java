package test;

import java.util.HashSet;

public class Lotte {
	public static void main(String[] args){
		HashSet set = new HashSet();
		int count=0;
		while(set.size()<6){
			set.add((int)(Math.random()*45)+1);
			//math.random�Լ��� 0.0���� 1.0���� �������� ����
			count++;
		}
		
		System.out.println(set);
		System.out.println(count);
	}

}