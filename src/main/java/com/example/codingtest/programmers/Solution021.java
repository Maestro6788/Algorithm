package com.example.codingtest.programmers;

class Solution021 {
	public int solution(String[] ings, String[] menu, String[] sell) {
		int answer = 0;
		String[][] ingsArr = new String[ings.length][2];
		String[][] menuArr = new String[menu.length][3];
		String[][] sellArr = new String[sell.length][2];


		//저장
		for(int i = 0 ; i < ings.length ; i++ ){
			String[] str = ings[i].split(" ");
			ingsArr[i][0] = str[0];
			ingsArr[i][1] = str[1];
		}

		for(int i = 0 ; i < menu.length ; i++ ){
			String[] str = menu[i].split(" ");
			menuArr[i][0] = str[0];
			menuArr[i][1] = str[1];
			menuArr[i][2] = str[2];
		}

		for(int i = 0 ; i < sell.length ; i++ ){
			String[] str = sell[i].split(" ");
			sellArr[i][0] = str[0];
			sellArr[i][1] = str[1];
		}

		// 계산

		for (int i = 0 ; i < sell.length; i++){

			String menuName = "";
			String menuProduct = "";
			int menuPrice = 0;
			int price = 0;

			//메뉴 찾기
			for ( int j = 0 ; j < menu.length ; j++){

				if (menuArr[j][0].equals(sellArr[i][0])){
					menuName = menuArr[j][0];
					menuProduct = menuArr[j][1];
					menuPrice = Integer.parseInt(menuArr[j][2]);
					break;
				}
			}

			// ings 단가 계산
			for (int j = 0 ; j < menuProduct.length() ; j++){
				for (int k = 0 ; k < ings.length ; k++){

					if (ingsArr[k][0].equals(menuProduct.substring(j,j+1))){
						price += Integer.parseInt(ingsArr[k][1]);
						break;
					}

				}
			}

			// 차익 계산
			answer = answer + (Integer.parseInt(sellArr[i][1]) * (menuPrice - price));

		}

		return answer;
	}
}