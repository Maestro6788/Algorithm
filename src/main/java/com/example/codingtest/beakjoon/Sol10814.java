package com.example.codingtest.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Sol10814 {

	public static class Info implements Comparable<Info>{

		int age;
		String name;

		public Info(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Info{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
		}

		@Override
		public int compareTo(Info o) {
			if (this.age > o.age){
				return 1;
			}
			else if(this.age == o.age){
				return 0;
			}


			return -1;

		}
	}


	public static void main(String[] args) throws IOException {
		// 입력 받는 과정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		List<Info> list = new ArrayList<>();

		for (int i =0; i< num ;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			String y = st.nextToken();

			list.add(new Info(x,y));
		}

		Collections.sort(list);

		for (int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i).age +  " " + list.get(i).name );
		}

	}


}
