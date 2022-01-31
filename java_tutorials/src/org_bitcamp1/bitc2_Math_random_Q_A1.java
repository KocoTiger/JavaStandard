package org_bitcamp1;

public class bitc2_Math_random_Q_A1 {

	public static void main(String[] args) {
		//진욱이 친구 답
		      double rand = Math.random();
		      int num = 0;
		      int min = 10;
		      int max = 45;

		        num = (int)((rand * (max - min + 1))+ min);

		      System.out.println(num);
		      System.out.println("-->" + rand);
		      System.out.println(String.format("%.6f", rand));
		      
		      
		      
		      
		    }
		}
