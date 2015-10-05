package org.devhq.gamerelease.game_release;

import java.util.Date;

public class Game {
	
	public String name;
	public Date releaseDate;
	
	/**
	 * Sets the game's name
	 * @param name The name of the game
	 * @return boolean
	 */
	public boolean setName(String name) {
		name = this.name;
		return true;
	}
	
	/**
	 * Returns a String that contains the name of the game
	 * @return Name of the game
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the game's release date
	 * @param release_date The release date of the game
	 * @return boolean
	 */
	public boolean setReleaseDate(Date release_date) {
		release_date = this.releaseDate;
		return true;
	}
	
	/**
	 * Returns a Date object that contains the game's release date
	 * @return Release date of the game
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

}
