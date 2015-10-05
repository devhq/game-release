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
	 * Sets the game's release date
	 * @param release_date The release date of the game
	 * @return boolean
	 */
	public boolean setReleaseDate(Date release_date) {
		release_date = this.releaseDate;
		return true;
	}
}
