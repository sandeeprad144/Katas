package com.yahtzee.categories;

import java.util.List;

import com.yahtzee.Utility;

public class TwoPairCategory implements ICategory {

	@Override
	public int getCategoryScore(List<Integer> listDiceValues) {
		
//		System.out.println("**** TwoPairCategory :getCategoryScore() ****");

		int score = 0;
		int scoreSecond = 0;
		score = Utility.GetSumRepeatedElements(listDiceValues, 2, 
				false, true);
		if (score == 0){
			return 0;
		}
		scoreSecond = Utility.GetSumRepeatedElements(listDiceValues, 2, 
				false, true);
		if (scoreSecond == 0) {
			return 0;
		}
		score += scoreSecond;
		return score;
	}
}
