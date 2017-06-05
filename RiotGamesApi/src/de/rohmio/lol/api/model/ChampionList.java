package de.rohmio.lol.api.model;

import java.util.Map;

public class ChampionList {

	private Map<String, String> keys;
	private Map<String, Champion> data;
	private String version;
	private String type;
	private String format;

	public Map<String, String> getKeys() {
		return keys;
	}
	public String getKeys(String key) {
		return keys.get(key);
	}
	public Map<String, Champion> getData() {
		return data;
	}
	public Champion getData(String key) {
		return data.get(key);
	}
	public String getVersion() {
		return version;
	}
	public String getType() {
		return type;
	}
	public String getFormat() {
		return format;
	}


}
