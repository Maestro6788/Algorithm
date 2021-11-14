/*
package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.List;

import jdk.swing.interop.SwingInterOpUtils;

public class Sol {

	public static int[] arr;
	public static boolean[] visit;
	public class Book{
		String phone;
		String name;

		public Book(String phone, String name) {
			this.phone = phone;
			this.name = name;
		}
	}
	public void sol() {

		List<Book> list = new ArrayList<>();
		boolean flag = false;
		for (int i = 0 ; i < phone_numbers.length ; i++){
			list.add(new Book(phone_numbers[i],phone_owners[i]));
		}
		Book book = new Book("","");
		for (int i = 0 ; i < list.size() ; i++){
			if (list.get(i).phone.equals(number)){
				flag = true;
				book = list.get(i);
				break;
			}
		}

		if (flag==false){
			return phone;
		}
		else{
			return book.name;
		}


	}

	public static void dfs(int N, int M, int depth) {

	}
}
*/
