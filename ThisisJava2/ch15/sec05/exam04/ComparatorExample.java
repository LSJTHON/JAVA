package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		TreeSet<Fruit> ts = new TreeSet<Fruit>(new FruitComparator());
		
		ts.add(new Fruit("포도",3000));
		ts.add(new Fruit("포도",10000));
		ts.add(new Fruit("포도",6000));
		
		
		for(Fruit fruit : ts) {
			System.out.println(fruit.name+": "+fruit.price);
		}
	}

}
