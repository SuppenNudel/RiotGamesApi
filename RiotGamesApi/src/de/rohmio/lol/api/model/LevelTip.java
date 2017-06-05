package de.rohmio.lol.api.model;

import java.util.List;

/**
 * This object contains champion level tip data.
 * @author Cedric
 *
 */
public class LevelTip {

	private List<String> effect;
	private List<String> label;

	public List<String> getEffect() {
		return effect;
	}
	public List<String> getLabel() {
		return label;
	}

}
