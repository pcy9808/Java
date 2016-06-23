package test;

import java.util.HashSet;

public class HashSetTest {
//set은 중복이 안되고 순서가 뒤죽박죽이다.
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Person[] p = new Person[10];
		for(int i=0; i<10;i++){
			p[i]=new Person(i+1);
			set.add(p[i]);
		}
		set.add(1);
		//값을 넣어주는 것
		set.add(2);
		set.add(1);

	}

}
