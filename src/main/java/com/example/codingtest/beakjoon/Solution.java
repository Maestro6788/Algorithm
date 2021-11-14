package com.example.codingtest.beakjoon;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Solution {

	class Time implements Comparable<Time> {

		private long startTime;
		private long endTime;

		public Time(long startTime, long endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}

		@Override
		public int compareTo(Time o) {
			if (this.startTime < o.startTime) {
				return -1;
			} else if (this.startTime == o.startTime) {
				return 0;
			} else {
				return 1;
			}
		}

	}

	public int solution(String[] lines) throws ParseException {
		int answer = 0;

		List<Time> list = new ArrayList<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

		for (int i = 0; i < lines.length; i++) {

			String[] timeData = lines[i].split(" ");
			String end = timeData[0] + " " + timeData[1];

			double parseDouble =
				Double.parseDouble(timeData[2].substring(0, timeData[2].length() - 1)) * 1000;
			long milliSecond = (long)parseDouble;

			// DateTime > long
			Date inputDate = simpleDateFormat.parse(end);
			Long resultEndTime = inputDate.getTime();

			list.add(new Time(resultEndTime - milliSecond, resultEndTime));
		}

		Collections.sort(list);

		// 최대 막대 개수 구하기
		int N = lines.length;
		for (int i = 0; i < N; i++) {
			int count = 0;
			boolean[] chk = new boolean[list.size()];

			for (int j = 0; j < N; j++) {

				if (rangeHasIn(list, i, j)) {
					count = countCheck(chk, j, count);
				}

				if (rangeHasOut(list, i, j)) {
					count = countCheck(chk, j, count);
				}
			}

			answer = Math.max(answer, count);
		}
		return answer;
	}

	private int countCheck(boolean chk[], int j, int count) {
		if (chk[j] != true) {
			chk[j] = true;
			count++;
		}
		return count;
	}

	private boolean rangeHasIn(List<Time> list, int i, int j) {
		long startRange = list.get(i).endTime - 1;
		long endRange = list.get(i).endTime + 999;

		if (list.get(j).startTime >= startRange
			&& list.get(j).endTime < endRange) {
			return true;
		}

		if (list.get(j).startTime >= startRange
			&& list.get(j).startTime < endRange) {
			return true;
		}

		if (list.get(j).endTime >= startRange
			&& list.get(j).endTime < endRange) {
			return true;
		}

		return false;
	}

	private boolean rangeHasOut(List<Time> list, int i, int j) {
		long startRange = list.get(i).endTime - 1;
		long endRange = list.get(i).endTime + 999;

		if (list.get(j).startTime <= startRange
			&& list.get(j).endTime > endRange) {
			return true;
		}
		return false;
	}

}
