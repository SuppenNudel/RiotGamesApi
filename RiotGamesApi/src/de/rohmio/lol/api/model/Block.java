package de.rohmio.lol.api.model;

import java.util.List;

/**
 * This object contains champion recommended block data.
 * @author Cedric
 *
 */
public class Block {

	private List<BlockItem> items;
	private Boolean recMath;
	private String type;

	public List<BlockItem> getItems() {
		return items;
	}
	public Boolean getRecMath() {
		return recMath;
	}
	public String getType() {
		return type;
	}

}
