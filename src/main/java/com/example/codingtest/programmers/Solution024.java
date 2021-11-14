package com.example.codingtest.programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution024 {
	public String solution(String[] log) throws ParseException {
		String answer = "";

		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		int studyTime = 0;

		for (int i = 0; i < log.length; i = i + 2) {
			String startTime = log[i];
			String endTime = log[i + 1];

			Date startDate = dateFormat.parse(startTime);
			long startDateTime = startDate.getTime();

			Date endDate = dateFormat.parse(endTime);
			long endDateTime = endDate.getTime();

			long minute = (endDateTime - startDateTime) / 60000;

			// 실 공부시간 계산
			if (minute >= 5){
				if (minute > 105){
					studyTime += 105;
				}
				else{
					studyTime += minute;
				}

			}

		}


		if (studyTime/60 < 10){
			if (studyTime%60 <10){
				answer = "0"+ studyTime/60 +":"+"0"+studyTime%60;
			}
			else{
				answer = "0"+ studyTime/60 +":"+studyTime%60;
			}
		}
		else{
			if (studyTime%60 <10){
				answer = studyTime/60 +":"+"0"+studyTime%60;
			}
			else{
				answer = studyTime/60 +":"+studyTime%60;
			}
		}

		return answer;
	}
}