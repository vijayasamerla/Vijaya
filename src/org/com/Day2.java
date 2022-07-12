package org.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day2{
public static void main(String[] args) {
	Map<Integer,String> m = new LinkedHashMap();
	m.put(20, "20");
	m.put(20, "90");
	m.put(30, "30");
	m.put(40, "40");
	m.put(50, "70");
	m.put(60, "80");
	m.put(70, "50");
	m.put(80, "60");
	m.put(90, "30");
	m.put(100, "40");
	System.out.println(m);
	int a=m.size();
	System.out.println(a);
}
}
