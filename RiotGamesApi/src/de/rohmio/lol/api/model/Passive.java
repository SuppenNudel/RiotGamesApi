package de.rohmio.lol.api.model;

import java.util.List;

import jdk.nashorn.internal.ir.Block;

/**
 * This object contains champion recommended data.
 * @author Cedric
 *
 */
public class Passive {

	private String map;
	private List<Block> blocks;
	private String champion;
	private String title;
	private Boolean priority;
	private String mode;
	private String type;

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

}
