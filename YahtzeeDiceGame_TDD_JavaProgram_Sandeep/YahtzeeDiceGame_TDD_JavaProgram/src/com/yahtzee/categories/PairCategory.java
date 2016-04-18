package com.yahtzee.categories;

import java.util.Collections;
import java.util.List;

public class PairCategory implements ICategory {

	@Override
	public int getCategoryScore(List<Integer> listDiceValues) {
		
//		System.out.println("**** PairCategory :getCategoryScore() ****");

		int score = 0;
		Collections.sort(listDiceValues, Collections.reverseOrder());
		
		for (Integer diceValue : listDiceValues){
			int frequency = Collections.frequency(listDiceValues, diceValue);
			if (frequency >= 2) {
				score = diceValue * 2;
				break;
			}
		}
		return score;
	}

}
