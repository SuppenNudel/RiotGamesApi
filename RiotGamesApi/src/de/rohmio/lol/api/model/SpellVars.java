package de.rohmio.lol.api.model;

import java.util.List;

/**
 * This object contains spell vars data.
 * @author Cedric
 *
 */
public class SpellVars {

	private String ranksWith;
	private String dyn;
	private String link;
	private List<Double> coeff;
	private String key;

	public String getRanksWith() {
		return ranksWith;
	}
	public String getDyn() {
		return dyn;
	}
	public String getLink() {
		return link;
	}
	public List<Double> getCoeff() {
		return coeff;
	}
	public String getKey() {
		return key;
	}

}
