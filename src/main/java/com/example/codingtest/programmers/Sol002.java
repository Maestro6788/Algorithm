package com.example.codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

class Sol002 {
	public int solution(int[] nums) {
		int answer = -1;

		List<Integer> list = new ArrayList<>();
		int max = 0;

		for (int i = 0 ; i < nums.length ; i++){
			for (int j = i+1 ; j < nums.length ; j++){
				for (int k = j+1 ; k < nums.length ; k++){

					list.add(nums[i]+nums[j]+nums[k]);
					max = Math.max(max,nums[i]+nums[j]+nums[k]);
				}
			}
		}
		System.out.println(max);

		boolean prime[] = new boolean[max+1];
		List<Integer> chk = new ArrayList<>();


		System.out.println(list);

		prime[0] = prime[1] = true;

		for(int i=2; i*i<=max; i++){
			// prime[i]가 소수라면
			if(!prime[i]){
				// prime[j] 소수가 아닌 표시
				for(int j=i*i; j<=max; j+=i){
					prime[j]=true;
				}
			}
		}

		// 소수 출력
		for(int i=1; i<=max;i++){
			if(!prime[i]) {
				chk.add(i);
			}
		}
		int count = 0;
		// 소수 확인
		for (int a : list){
			if(chk.contains(a)){
				count++;
			}

		}

		System.out.println(count);

		return count;
	}
}