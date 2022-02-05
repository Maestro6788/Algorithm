package com.example.codingtest.programmers;


public class NTS001 {


	public String changeConvection(String input){
		String result = "";


		// true sanke / false camel
		boolean nameFlag = false;


		for (int i = 0 ; i < input.length() ; i++){
			if(input.charAt(i) == '_'){
				nameFlag = true;
				break;
			}
		}


		// snake > camel
		if(nameFlag){
			String[] snakeName = input.split("_");
			String snakeNameResult = snakeName[0];

			for(int i = 1 ; i < snakeName.length ; i++){
				String str = snakeName[i].substring(0,1);
				str = str.toUpperCase();
				snakeNameResult += (str + snakeName[i].substring(1,snakeName[i].length()));
			}

			System.out.println(snakeNameResult);
			return snakeNameResult;
		}


		int beginIndex = 0;
		int endIndex = 0;
		int count = 0;
		String camelNameResult = "";
		if(!nameFlag){

			for (int i = 0 ; i < input.length() ; i++) {

				if(input.charAt(i) >= 'A' && input.charAt(i) <='Z'){

					String str = String.valueOf(input.charAt(i)).toLowerCase();
					camelNameResult += ("_" + str);


					continue;
				}

				camelNameResult += input.charAt(i);


			}

			System.out.println(camelNameResult);

		}



		return result;
	}




}







// 	프로그래밍 언어마다 변수를 표기하기 위한 특정한 표기법을 권장한다.
// 	단어를 밑줄로 구분하는 스네이크표기법과, 단어가 바뀔 때마다 대문자로 시작하는 카멜표기법이 대표적이다.
// 	두가지 표기법으로 변환하는 프로그램을 구현하시오.
//
// 	ex) this_is_long_variable_name 이 입력되면, thisIsLongVariableName 이라고 리턴하고,
// 	thisIsLongVariableName 이 입력되면, this_is_long_variable_name 이라고 리턴한다.
//
// public String changeConvection(String input){
// 	String result = "";
// 	}
