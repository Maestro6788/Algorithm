package com.example.codingtest.custom;

public class decimal {

	public static boolean[] prime;
	//소수구하기
	public void operate(){

		int start = 0;
		int end = 0 ;


		for (int index = start ; index < end ; index++){

			decimalSpectrum(index);


		}

	}

	// 해당 범위 소수 인지 구하기
	public void decimalSpectrum(int index){

		prime = new boolean[index+1];

		if ( index < 2){
			return ;
		}

		if ( index == 2){
			return ;
		}

		// p x q 가 N을 만족할때
		// p q중 둘중 하난 반드시 루트n보다 작거나 같아야 됩니다.
		// 즉 나우어 떨어지는 수가 있다면 소수가 아니므로
		// 루트 n 까지만 하여 시간복잡도를 N에서 루트 N까지 줄일수 있습니다.

		for (int i = 2 ; i < Math.sqrt(index) ; i++){

			if (prime[i] == true){
				continue;
			}


			for (int j = i*i ; j < prime.length; j = j+i){

				prime[j] = true;

			}


		}





	}

}
