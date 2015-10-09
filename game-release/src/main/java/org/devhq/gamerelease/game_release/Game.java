package org.devhq.gamerelease.game_release;

import java.util.Date;

public class Game {
	
	private int gameId;
	private String name = null;
	private Date releaseDate = null;
	
	/**
	 * Returns an int that is the Game ID
	 * @return Game ID
	 */
	public int getGameId() {
		return gameId;
	}

	/**
	 * Sets the game's ID number
	 * @param gameId ID of the game
	 */
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	/**
	 * Returns a String that contains the name of the game
	 * @return Name of the game
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the game's name
	 * @param name The name of the game
	 * @return boolean
	 */
	public boolean setName(String name) {
		this.name = name;
		return true;
	}
	
	/**boolean
	 * Returns a Date object that contains the game's release date
	 * @return Release date of the game
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	/**
	 * Sets the game's release date
	 * @param release_date The release date of the game
	 * @return boolean
	 */
	public boolean setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
		return true;
	}

}
