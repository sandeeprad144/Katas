package com.yahtzee.categories;

import java.util.List;

public class NsCategory implements ICategory {

	private int nValue;
	public NsCategory(int nValue) {
		
//		System.out.println("**** NsCategory: Constructor() ****");

		this.nValue = nValue;
	}
	@Override
	public int getCategoryScore(List<Integer> listDiceValues) {
		
//		System.out.println("**** NsCategory: getCategoryScore() ****");

		int score = 0;
		for (Integer diceValue : listDiceValues){
			if (diceValue == nValue){
				score += nValue;
			}
		}		
		return score;
	}

}
