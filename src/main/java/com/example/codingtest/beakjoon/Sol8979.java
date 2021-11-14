package com.example.codingtest.beakjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol8979 {

	public static int[][] arr;
	public static boolean[] visit;

	public class Medal implements Comparable<Medal> {

		private int num;
		private int gold;
		private int siver;
		private int bronze;

		public Medal(int num, int gold, int siver, int bronze) {
			this.num = num;
			this.gold = gold;
			this.siver = siver;
			this.bronze = bronze;
		}

		@Override
		public String toString() {
			return "Medal{" +
				"num=" + num +
				", gold=" + gold +
				", siver=" + siver +
				", bronze=" + bronze +
				'}';
		}

		@Override
		public int compareTo(Medal o) {
			if (o.gold > gold){
				return 1;
			}
			else if (o.gold == gold){
				if (o.siver < siver){
					return 1;
				}
				else if(o.siver == siver){

					if (o.bronze < bronze){
						return 1;
					}
					else if (o.bronze == bronze){
						return 0;
					}

				}
			}
			return -1;
		}

	}

	public void sol() {

		List<Medal> list = new ArrayList<>();
		list.add(new Medal(1,1,3,2));
		list.add(new Medal(2,2,3,2));
		list.add(new Medal(3,2,3,3));
		list.add(new Medal(4,2,5,2));
		list.add(new Medal(5,1,1,1));
		list.add(new Medal(6,9,9,9));
		list.add(new Medal(7,9,9,7));
		list.add(new Medal(8,9,9,8));
		list.add(new Medal(9,1,2,1));


		Collections.sort(list);

		for (Medal medal : list){
			System.out.println(medal);
		}
	}

}
