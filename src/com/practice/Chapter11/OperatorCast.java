package com.practice.Chapter11;

public class OperatorCast {

	public static void main(String[] args) {

		int gameScore = 150;
		int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore+1;
		lastScore = gameScore++;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}
}
