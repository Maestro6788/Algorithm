package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sol1092 {

	public void sol() {

		int crainNum = 3;
		Integer[] crainArr = new Integer[] {6, 8, 9};
		int boxNum = 5;
		Integer[] boxArr = new Integer[] {2, 5, 2, 4, 7};

		Arrays.sort(crainArr, Collections.reverseOrder());
		Arrays.sort(boxArr, Collections.reverseOrder());

		int count = 0;
		int complete = 0;
		int time = 0;
		boolean flag = false;

		while (count > 3) {

			for (int i = 0; i < crainNum; i++) {

				for (int k = 0; k < boxNum; k++) {
					if (crainArr[i] >= boxArr[k] && boxArr[k] !=0){
						boxArr[k] = 0 ;
						count--;
						complete++;
						break;
					}

				}

			}
			time++;
			if (complete == boxNum){
				flag = true;
				break;
			}



		}

		if (flag == true){
			System.out.println(time);
		}
		else{
			System.out.println(-1);
		}




	}

}
