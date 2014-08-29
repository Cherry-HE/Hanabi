package org.git.antoxin.hanabi.model;

import java.util.Collections;
import java.util.Stack;

import org.git.antoxin.hanabi.model.IConstants.HanabiColor;
import org.git.antoxin.hanabi.model.IConstants.HanabiRank;

public class HanabiDeck {
	private final Stack<HanabiCard> deck;

	public HanabiDeck() {
		deck = initDeck();
	}

	protected Stack<HanabiCard> initDeck() {
		Stack<HanabiCard> cards = new Stack<HanabiCard>();
		for (HanabiColor color : HanabiColor.values()) {
			for (HanabiRank rank : HanabiRank.values()) {
				switch (rank) {
				case ONE:
					addXCardYToZ(cards, 3, color, rank);
					break;
				case TWO:
				case THREE:
				case FOUR:
					addXCardYToZ(cards, 2, color, rank);
					break;
				case FIVE:
					addXCardYToZ(cards, 1, color, rank);
					break;
				}
			}
		}
		Collections.shuffle(cards);
		return cards;
	}

	private void addXCardYToZ(Stack<HanabiCard> cards, int numberOfCards,
			HanabiColor color, HanabiRank rank) {
		for (int i = 0; i < numberOfCards; i++) {
			cards.add(new HanabiCard(color, rank));
		}
	}

	public Stack<HanabiCard> getDeck() {
		return deck;
	}
}
