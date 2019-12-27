package javaProblems;

import java.util.ArrayList;
import java.util.List;

public class EvenArrayElements {

	public static void main(String[] args) {
		List <Integer>l= new ArrayList<>();
		l.add(4);
		l.add(8);
		l.add(4);
		l.add(9);
		l.add(2);
		l.add(1);
		System.out.println(l);
		l.forEach(n->{if (n%2==0)System.out.println(n);});
		
	}

}
