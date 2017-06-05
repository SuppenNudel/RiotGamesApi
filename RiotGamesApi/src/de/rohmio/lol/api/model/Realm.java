package de.rohmio.lol.api.model;

import java.util.Map;

public class Realm {

	private String lg; // Legacy script mode for IE6 or older.
	private String dd; // Latest changed version of Dragon Magic.
	private String l; // Default language for this realm.
	private Map<String, String> n; // Latest changed version for each data type listed.
	private Integer profileiconmax; // Special behavior number identifying the largest profile icon ID that can be used under 500. Any profile icon that is requested between this number and 500 should be mapped to 0.
	private String store; // Additional API data drawn from other sources that may be related to Data Dragon functionality.
	private String v; // Current version of this file for this realm.
	private String cdn; // The base CDN URL.
	private String css; // Latest changed version of Dragon Magic's CSS file.

	public String getLg() {
		return lg;
	}
	public String getDd() {
		return dd;
	}
	public String getL() {
		return l;
	}
	public Map<String, String> getN() {
		return n;
	}
	public Integer getProfileiconmax() {
		return profileiconmax;
	}
	public String getStore() {
		return store;
	}
	public String getV() {
		return v;
	}
	public String getCdn() {
		return cdn;
	}
	public String getCss() {
		return css;
	}

}
