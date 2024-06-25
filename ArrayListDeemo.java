package com.collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDeemo {
	//main method
	public static void main(String[] args) {
			//initializing object for ArrayList
			ArrayList list=new ArrayList();
			//adding elements
			list.add(10);
			list.add(20);
			list.add(30);
			list.add('a');
			list.add(3.14);
			list.add("java");
			//printing elements in the arrayList
			System.out.println(list);
			//prints element 2 in first index position
			list.add(1,2);
			System.out.println(list);
			//prints element 4 in second index position
			list.add(2,4);
			System.out.println(list);
			list.add(30);
			list.add(20);
			System.out.println(list);
			//prints null 
			list.add(null);
			System.out.println(list);
			//prints the index value of element 20
			System.out.println(list.indexOf(20));
			//checks whether element is present or not
			System.out.println(list.contains(1));
			//prints zero indexed element 
			System.out.println(list.get(0));
			//prints the index value of element 20 from last
			System.out.println(list.lastIndexOf(20));
			//prints size of arrayList
			System.out.println(list.size());
			//deletes the element java
			System.out.println(list.remove("java"));
			System.out.println(list);
		}
	}


