package org.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
	public static void main(String[] args) {
		Set<Integer>value=new TreeSet<Integer>();
		value.add(10);
		value.add(202);
		value.add(303);
		value.add(404);
		value.add(505);
		value.add(606);
		value.add(707);
		value.add(808);
		value.add(909);
		value.add(1010);
		value.add(2020);
		value.add(3030);
		
	Set<Integer>val=new TreeSet<Integer>();
	val.add(10);
	val.add(202);
	val.add(303);
	val.add(404);
	val.add(505);
	val.add(600);
	val.add(1000);
	
		val.removeAll(value);
		System.out.println(val);
		
	}
}
