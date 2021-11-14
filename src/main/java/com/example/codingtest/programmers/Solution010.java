package com.example.codingtest.programmers;

class Solution010 {
	public int solution(String s) {
		String answer = "";
		String[][] arr = new String[][]{{"0","zero"},{"1","one"},{"2","two"},{"3","three"},{"4","four"},{"5","five"},{"6","six"},
			{"7","seven"},{"8","eight"},{"9","nine"}};

		for (int i =0 ; i < s.length() ; i++){
			boolean flag = false;
			for (int j = 0 ; j < arr.length ; j++){
				if (arr[j][0].equals(s.substring(i,i+1))) {
					answer = answer + arr[j][0];
					flag =true;
					break;
				}
			}

			int target = 0;
			if (flag == false){
				for (int k = i+2 ; k <= s.length() ; k++){

					for (int j = 0 ; j < arr.length ; j++){
						if (arr[j][1].equals(s.substring(i,k))) {
							answer = answer + arr[j][0];
							flag = true;
							target = s.substring(i,k).length();
							break;
						}
					}


					if (flag == true){
						i = i + target -1 ;
						break;
					}
				}


			}



		}


		return Integer.parseInt(answer);
	}
}