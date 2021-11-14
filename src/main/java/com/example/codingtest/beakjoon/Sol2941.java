package com.example.codingtest.beakjoon;

public class Sol2941 {



	public static String[] arr;
	public static String input = "ljes=njak";


	public static boolean[] visit;

	public void sol() {

		int count = 0 ;
		int flag = 0;
		arr = new String[]{"c=","d-","dz=","d-","lj","nj","s=","z="};

		for (int i =0 ; i < input.length() ; i++){
			for (int j = i ; j < i+3 && j< input.length() ; j++){

				String arrString = input.substring(i,j+1);
				for (int index = 0; index < arr.length ; index++){
					if (arrString.equals(arr[index])){

						flag = 2;
						break;
					}
				}

				if (flag == 2){
					count++;
					i = i+j;
					flag = 1;
					break;
				}


			}
			System.out.println(i);
			if (flag == 0){
				count++;
			}

			flag = 0;
		}

		System.out.println("정답은 : " + count);

		System.out.println("하이");
	}

	public static void dfs(int N, int M, int depth) {

	}
}
