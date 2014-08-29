package org.git.antoxin.hanabi.model;

import org.git.antoxin.hanabi.model.IConstants.HanabiColor;
import org.git.antoxin.hanabi.model.IConstants.HanabiRank;

public class HanabiCard {
	private final HanabiColor color;
	private final HanabiRank rank;
	
	public HanabiCard (HanabiColor color, HanabiRank rank) {
		this.color = color;
		this.rank = rank;
	}

	public HanabiColor getColor() {
		return color;
	}

	public HanabiRank getRank() {
		return rank;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HanabiCard other = (HanabiCard) obj;
		if (color != other.color)
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
	
	
}
