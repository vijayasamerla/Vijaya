package org.com;

import java.util.LinkedList;

public class List {
public static void main(String[] args) {
	LinkedList<String> value=new LinkedList();
	value.add("100");
	value.add("200");
	value.add("300");
	value.add("400");
	int lenght = value.size();
	System.out.println("the size of the value:"+value);
}

}
