package com.yahtzee.categories;

import java.util.Collections;
import java.util.List;

public class SmallOrLargeStraightCategory implements ICategory {

	private int firstValueStraight;
	
	public SmallOrLargeStraightCategory(int firstValueStraight) {

//		System.out.println("**** SmallOrLargeStraightCategory :Constructor() ****");

		this.firstValueStraight = firstValueStraight;
	}
	
	@Override
	public int getCategoryScore(List<Integer> listDiceValues) {
		
//		System.out.println("**** SmallOrLargeStraightCategory :getCategoryScore() ****");

		int score = 0;
		Collections.sort(listDiceValues);
		for (Integer diceValue : listDiceValues) {
			if (diceValue != firstValueStraight++){
				return 0;
			}
			score += diceValue;
		}
		return score;
	}

}
