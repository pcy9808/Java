package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//ctrl + shift + 0 은 자동으로 import가 생성됨
		Person[] p = new Person[10];
		
		for(int i=0;i<10;i++){
			p[i] = new Person(i+1);
			list.add(p[i]);
		}
		list.add(1);
		list.add(2);
		House h = new House();
		list.add(h);
		
		System.out.println(list);
	}

}
