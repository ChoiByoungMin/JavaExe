package ch10.collevtion01.ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.Price < o2.Price) return -1;
		else if(o1.Price == o2.Price) return 0;
		else return 1;
	}

}
