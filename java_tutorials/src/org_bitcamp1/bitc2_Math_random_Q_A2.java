package org_bitcamp1;

public class bitc2_Math_random_Q_A2 {

	public static void main(String[] args) {
	    double rand = Math.random();
	    int min = 10;
	    int max = 45;
	      
	    rand = (rand % (max - min + 1)) + min;

	    System.out.println(String.format("%.6f", rand));
	    }
	}



