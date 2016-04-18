package com.yahtzee.categories;

import java.util.List;

import com.yahtzee.Utility;

public class MatchXSameKindCategory implements ICategory {

//	System.out.println("**** MatchXSameKindCategory ****");

	private int matchN;
	public MatchXSameKindCategory(int matchN) {
		this.matchN = matchN;
	}
	
	@Override
	public int getCategoryScore(List<Integer> listDiceValues) {
		
//		System.out.println("**** MatchXSameKindCategory: getCategoryScore() ****");

		int score = 0;
		score = Utility.GetSumRepeatedElements(listDiceValues, matchN, false, false);
		if (matchN == 5 && score > 0) {
			score = 50;             //Yahtzee highest Score
		}
		return score;
	}

}
