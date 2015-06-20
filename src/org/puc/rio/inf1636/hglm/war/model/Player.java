package org.puc.rio.inf1636.hglm.war.model;

import java.awt.Color;

public class Player {

	private String name;
	private Color color;
	private int numberOfTerritories = 0;
	public final static Color[] playerColors = { new Color(128,0,0) /* MAROON */, Color.GREEN.darker(),
			Color.BLUE, Color.YELLOW, new Color(255,0,255).darker() /* FUSCIA */, Color.BLACK };

	public Player(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public Color getColor() {
		return this.color;
	}
	
	public int addTerritory() {
		return ++this.numberOfTerritories;
	}
	
	public int removeTerritory() {
		return --this.numberOfTerritories;
	}

	public int getNumberOfTerritories() {
		return this.numberOfTerritories;
	}
	
	public static Color getForegroundColor(Color c) {
		if (c == Color.BLUE || c == Color.BLACK || c.equals(new Color(128,0,0))) {
			return Color.WHITE;
		} else {
			return Color.BLACK;
		}
	}
}
