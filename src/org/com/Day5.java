package org.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Day5 {
public static void main(String[] args) {
	Set<Integer> li=new HashSet();
	li.add(10);
	li.add(505);
	li.add(606);
	li.add(707);
	li.add(808);
	li.add(909);
	li.add(1010);
	li.add(2020);
	li.add(3030);
	System.out.println(li);

	for (Integer num :li) {
		System.out.println("the num is :"+num);
	}
}
}
