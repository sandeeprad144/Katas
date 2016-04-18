package com.yahtzee;

import java.util.Collections;
import java.util.List;

public class Utility {
	
	public static int GetSumRepeatedElements(List<Integer> listDiceValues, int minNumberOfRepeats, boolean
			isUpperLimitOnRepeats, boolean truncateDiceValues){
		
//		System.out.println("**** Utility: GetSumRepeatedElements() ****");
		
		int score = 0;
		for (Integer diceValue : listDiceValues){
			int frequency = Collections.frequency(listDiceValues, diceValue);
			if ((isUpperLimitOnRepeats && frequency == minNumberOfRepeats) ||
					(!isUpperLimitOnRepeats && frequency >= minNumberOfRepeats)){
				score = diceValue * minNumberOfRepeats;
				if (truncateDiceValues) {
					truncateDiceList(listDiceValues, diceValue);
				}
				break;
			}						
		}
		return score;
	}

	public static void truncateDiceList(List<Integer> diceValues, Integer diceValue) {
		diceValues.removeAll(Collections.singleton(diceValue));		
	}
	

}
