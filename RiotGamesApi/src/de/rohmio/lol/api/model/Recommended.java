package de.rohmio.lol.api.model;

import java.util.List;

/**
 * This object contains champion recommended data.
 * 
 * @author Cedric
 *
 */
public class Recommended {

	private String map;
	private List<Block> blocks;
	private String champion;
	private String title;
	private Boolean priority;
	private String mode;
	private String type;

	private int sortrank;

	@Override
	public String toString() {
		return String.format("%s for %s on %s", title, champion, map);
	}

	/**
	 * for itemset creator
	 */
	public Recommended(String title) {
		this.title = title;
	}

	public Recommended() {
		this("(default)");
	}

	public String getMap() {
		return map;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public String getChampion() {
		return champion;
	}

	public String getTitle() {
		return title;
	}

	public Boolean getPriority() {
		return priority;
	}

	public String getMode() {
		return mode;
	}

	public String getType() {
		return type;
	}

	public int getSortrank() {
		return sortrank;
	}

}
